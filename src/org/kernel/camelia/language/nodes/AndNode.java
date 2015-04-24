package org.kernel.camelia.language.nodes;


import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class AndNode extends Node {
  private Node receiver;
  private Node argument;
  
  /**
    receiver && argument
  */
  public AndNode(Node receiver, Node argument) {
    this.receiver = receiver;
    this.argument = argument;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    CameliaObject receiverEvaled = receiver.eval(context);
    if (receiverEvaled.isTrue())
      return argument.eval(context);
    return receiverEvaled;
  }
}