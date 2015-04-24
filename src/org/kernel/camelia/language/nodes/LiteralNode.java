package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class LiteralNode extends Node {
  CameliaObject value;
  
  public LiteralNode(CameliaObject value) {
    this.value = value;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    return value;
  }
}