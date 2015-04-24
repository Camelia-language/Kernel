package org.kernel.camelia.language;

import java.util.HashMap;

/**
  Any object, instance of a class, inside the runtime.
  Objects store a class and instance variables.
*/
public class CameliaObject {
  private CameliaClass cameliaClass;
  private HashMap<String, CameliaObject> instanceVariables;
  
  /**
    Creates an instance of class yourLangClass.
  */
  public CameliaObject(CameliaClass cameliaClass) {
    this.cameliaClass = cameliaClass;
    this.instanceVariables = new HashMap<String, CameliaObject>();
  }
  
  public CameliaObject(String className) {
    this(CameliaRuntime.getRootClass(className));
  }
  
  public CameliaObject() {
    this(CameliaRuntime.getObjectClass());
  }
  
  public CameliaClass getCameliaClass() {
    return cameliaClass;
  }
  
  public void setCameliaClass(CameliaClass klass) {
    cameliaClass = klass;
  }
  
  public CameliaObject getInstanceVariable(String name) {
    if (hasInstanceVariable(name))
      return instanceVariables.get(name);
    return CameliaRuntime.getNil();
  }

  public boolean hasInstanceVariable(String name) {
    return instanceVariables.containsKey(name);
  }
  
  public void setInstanceVariable(String name, CameliaObject value) {
    instanceVariables.put(name, value);
  }
  
  /**
    Call a method on the object.
  */
  public CameliaObject call(String method, CameliaObject arguments[]) throws CameliaException {
    return cameliaClass.lookup(method).call(this, arguments);
  }

  public CameliaObject call(String method) throws CameliaException {
    return call(method, new CameliaObject[0]);
  }
  
  /**
    Only false and nil are not true.
  */
  public boolean isTrue() {
    return !isFalse();
  }
  
  /**
    Only false and nil are false. This is overridden in ValueObject.
  */
  public boolean isFalse() {
    return false;
  }

  /**
    Only nil is nil. This is overridden in ValueObject.
  */
  public boolean isNil() {
    return false;
  }
  
  /**
    Convert to a Java object. This is overridden in ValueObject.
  */
  public Object toJavaObject() {
    return this;
  }
  
  public <T> T as(Class<T> clazz) throws TypeError {
    if (clazz.isInstance(this)){
      return clazz.cast(this);
    }
    throw new TypeError(clazz.getName(), this);
  }
  
  public String asString() throws TypeError {
    return as(ValueObject.class).getValueAs(String.class);
  }

  public Integer asInteger() throws TypeError {
    return as(ValueObject.class).getValueAs(Integer.class);
  }

  public Float asFloat() throws TypeError {
    return as(ValueObject.class).getValueAs(Float.class);
  }
}
