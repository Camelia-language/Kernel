package org.kernel.camelia.language;

/**
  Exception thrown when a unknown method is called.
*/
public class MethodNotFound extends CameliaException {
  public MethodNotFound(String method) {
    super(method + " not found");
    setRuntimeClass("MethodNotFound");
  }
}