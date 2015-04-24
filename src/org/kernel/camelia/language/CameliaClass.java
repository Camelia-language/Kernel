package org.kernel.camelia.language;

import java.util.HashMap;

/**
  Class in the runtime.
  Classes store methods and constants. Each object in the runtime has a class.
*/
public class CameliaClass extends CameliaObject {
  private String name;
  private CameliaClass superClass;
  private HashMap<String, Method> methods;
  HashMap<String, CameliaObject> constants;
  
  /**
    Creates a class inheriting from superClass.
  */
  public CameliaClass(String name, CameliaClass superClass) {
    super("Class");
    this.name = name;
    this.superClass = superClass;
    methods = new HashMap<String, Method>();
    constants = new HashMap<String, CameliaObject>();
  }
  
  /**
    Creates a class inheriting from Object.
  */
  public CameliaClass(String name) {
    this(name, CameliaRuntime.getObjectClass());
  }
  
  public String getName() {
    return name;
  }
  
  public CameliaClass getSuperClass() {
    return superClass;
  }
  
  public void setConstant(String name, CameliaObject value) {
    constants.put(name, value);
  }

  public CameliaObject getConstant(String name) {
    if (constants.containsKey(name)) return constants.get(name);
    if (superClass != null) return superClass.getConstant(name);
    return CameliaRuntime.getNil();
  }
  
  public boolean hasConstant(String name) {
    if (constants.containsKey(name)) return true;
    if (superClass != null) return superClass.hasConstant(name);
    return false;
  }
  
  public Method lookup(String name) throws MethodNotFound {
    if (methods.containsKey(name)) return methods.get(name);
    if (superClass != null) return superClass.lookup(name);
    throw new MethodNotFound(name);
  }

  public boolean hasMethod(String name) {
    if (methods.containsKey(name)) return true;
    if (superClass != null) return superClass.hasMethod(name);
    return false;
  }
  
  public void addMethod(String name, Method method) {
    methods.put(name, method);
  }
  
  /**
    Creates a new instance of the class.
  */
  public CameliaObject newInstance() {
    return new CameliaObject(this);
  }
  
  /**
    Creates a new instance of the class, storing the value inside a ValueObject.
  */
  public CameliaObject newInstance(Object value) {
    return new ValueObject(this, value);
  }
  
  /**
    Creates a new subclass of this class.
  */
  public CameliaClass newSubclass(String name) {
    CameliaClass klass = new CameliaClass(name, this);
    CameliaRuntime.getObjectClass().setConstant(name, klass);
    return klass;
  }
  
  /**
    Creates or returns a subclass if it already exists.
  */
  public CameliaClass subclass(String name) {
    CameliaClass objectClass = CameliaRuntime.getObjectClass();
    if (objectClass.hasConstant(name)) return (CameliaClass) objectClass.getConstant(name);
    return newSubclass(name);
  }
  
  /**
    Returns true if klass is a subclass of this class.
  */
  public boolean isSubclass(CameliaClass klass) {
    if (klass == this) return true;
    if (klass.getSuperClass() == null) return false;
    if (klass.getSuperClass() == this) return true;
    return isSubclass(klass.getSuperClass());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if ( !(other instanceof CameliaClass) ) return false;
    return name == ((CameliaClass)other).getName();
  }
}
