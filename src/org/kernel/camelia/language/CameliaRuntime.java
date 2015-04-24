package org.kernel.camelia.language;

/**
  Language runtime. Mostly helper methods for retrieving global values.
*/
public class CameliaRuntime {
  static CameliaClass objectClass;
  static CameliaObject mainObject;
  static CameliaObject nilObject;
  static CameliaObject trueObject;
  static CameliaObject falseObject;
  
  public static CameliaClass getObjectClass() {
    return objectClass;
  }

  public static CameliaObject getMainObject() {
    return mainObject;
  }

  public static CameliaClass getRootClass(String name) {
    // objectClass is null when boostrapping
    return objectClass == null ? null : (CameliaClass) objectClass.getConstant(name);
  }

  public static CameliaClass getExceptionClass() {
    return getRootClass("Exception");
  }
  
  public static CameliaObject getNil() {
    return nilObject;
  }
  
  public static CameliaObject getTrue() {
    return trueObject;
  }

  public static CameliaObject getFalse() {
    return falseObject;
  }
  
  public static CameliaObject toBoolean(boolean value) {
    return value ? CameliaRuntime.getTrue() : CameliaRuntime.getFalse();
  }
}
