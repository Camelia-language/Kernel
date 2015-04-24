package org.kernel.camelia.language;

/**
  Specialized method of operators (+, -, *, /, etc.)
*/
public abstract class OperatorMethod<T> extends Method {
  @SuppressWarnings("unchecked")
  public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
    T self = (T) receiver.as(ValueObject.class).getValue();
    T arg = (T) arguments[0].as(ValueObject.class).getValue();
    return perform(self, arg);
  }
  
  public abstract CameliaObject perform(T receiver, T argument) throws CameliaException;
}
