package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class ConstantAssignNode extends Node {
  private String name;
  private Node expression;
  
  public ConstantAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    CameliaObject value = expression.eval(context);
    context.getCurrentClass().setConstant(name, value);
    return value;
  }
}