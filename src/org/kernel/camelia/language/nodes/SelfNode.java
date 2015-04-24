package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class SelfNode extends Node {
  public CameliaObject eval(Context context) throws CameliaException {
    return context.getCurrentSelf();
  }
}