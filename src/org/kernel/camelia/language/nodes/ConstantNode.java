package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

/**
  Get the value of a constant.
*/
public class ConstantNode extends Node {
  private String name;
  
  public ConstantNode(String name) {
    this.name = name;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    return context.getCurrentClass().getConstant(name);
  }
}