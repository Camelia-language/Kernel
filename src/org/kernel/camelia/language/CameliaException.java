package org.kernel.camelia.language;

/**
  Exception that can be catched from inside the runtime.
*/
public class CameliaException extends Exception {
  private CameliaClass runtimeClass;
  
  /**
    Creates a new exception from a runtime class.
    @param runtimeClass Class of the exception from whitin the language.
  */
  public CameliaException(CameliaClass runtimeClass, String message) {
    super(message);
    this.runtimeClass = runtimeClass;
  }

  public CameliaException(CameliaClass runtimeClass) {
    super();
    this.runtimeClass = runtimeClass;
  }
  
  public CameliaException(String runtimeClassName, String message) {
    super(message);
    setRuntimeClass(runtimeClassName);
  }
  
  /**
    Creates a new exception from the Exception runtime class.
  */
  public CameliaException(String message) {
    super(message);
    this.runtimeClass = CameliaRuntime.getExceptionClass();
  }
  
  /**
    Wrap an exception to pass it to the runtime.
  */
  public CameliaException(Exception inner) {
    super(inner);
    setRuntimeClass(inner.getClass().getName());
  }
  
  /**
    Returns the runtime instance (the exception inside the language) of this exception.
  */
  public CameliaObject getRuntimeObject() {
    CameliaObject instance = runtimeClass.newInstance(this);
    instance.setInstanceVariable("message", new ValueObject(getMessage()));
    return instance;
  }

  public CameliaClass getRuntimeClass() {
    return runtimeClass;
  }

  protected void setRuntimeClass(String name) {
    runtimeClass = CameliaRuntime.getExceptionClass().subclass(name);
  }
}