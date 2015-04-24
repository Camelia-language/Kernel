package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.CameliaRuntime;
import org.kernel.camelia.language.Context;

/**
  Negate a value.
*/
public class NotNode extends Node {
  private Node receiver;
  
  /**
    !receiver
  */
  public NotNode(Node receiver) {
    this.receiver = receiver;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    if (receiver.eval(context).isTrue())
      return CameliaRuntime.getFalse();
    return CameliaRuntime.getTrue();
  }
}