package org.kernel.camelia.language.nodes;


import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.CameliaRuntime;
import org.kernel.camelia.language.Context;

public class IfNode extends Node {
  private Node condition;
  private Node ifBody;
  private Node elseBody;
  
  public IfNode(Node condition, Node ifBody, Node elseBody) {
    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    if (condition.eval(context).isTrue()) {
      return ifBody.eval(context);
    } else if (elseBody != null) {
      return elseBody.eval(context);
    }
    return CameliaRuntime.getNil();
  }
}