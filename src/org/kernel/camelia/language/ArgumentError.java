package org.kernel.camelia.language;

/**
  Exception thrown when a unknown method is called.
*/
public class ArgumentError extends CameliaException {
  public ArgumentError(String method, int expected, int actual) {
    super("Expected " + expected + " arguments for " + method + ", got " + actual);
    setRuntimeClass("ArgumentError");
  }
}