package org.kernel.camelia.language;

/**
  A method attached to a YourLangClass.
*/
public abstract class Method {
  /**
    Calls the method.
    @param receiver  Instance on which to call the method (self).
    @param arguments Arguments passed to the method.
  */
  public abstract CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException;
}
