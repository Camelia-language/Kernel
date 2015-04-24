package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class LocalAssignNode extends Node {
  private String name;
  private Node expression;
  
  public LocalAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    CameliaObject value = expression.eval(context);
    context.setLocal(name, value);
    return value;
  }
}