package org.kernel.camelia.language;

/**
  Anything that can be evaluated inside a context must implement this interface.
*/
public interface Evaluable {
  CameliaObject eval(Context context) throws CameliaException;
}
