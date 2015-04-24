package org.kernel.camelia.language.nodes;


import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class OrNode extends Node {
  private Node receiver;
  private Node argument;
  
  /**
    receiver || argument
  */
  public OrNode(Node receiver, Node argument) {
    this.receiver = receiver;
    this.argument = argument;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    CameliaObject receiverEvaled = receiver.eval(context);
    if (receiverEvaled.isTrue())
      return receiverEvaled;
    return argument.eval(context);
  }
}