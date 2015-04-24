package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.CameliaRuntime;
import org.kernel.camelia.language.Context;

public class WhileNode extends Node {
  private Node condition;
  private Node body;
  
  public WhileNode(Node condition, Node body) {
    this.condition = condition;
    this.body = body;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    while (condition.eval(context).isTrue()) {
      body.eval(context);
    }
    return CameliaRuntime.getNil();
  }
}