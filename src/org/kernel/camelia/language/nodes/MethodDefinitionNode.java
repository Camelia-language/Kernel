package org.kernel.camelia.language.nodes;

import org.kernel.camelia.language.*;

import java.util.List;



public class MethodDefinitionNode extends Node {
  private String name;
  private Node body;
  private List<String> parameters;
  
  public MethodDefinitionNode(String name, List<String> parameters, Node body) {
    this.name = name;
    this.parameters = parameters;
    this.body = body;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    String parameterNames[];
    if (parameters == null) {
      parameterNames = new String[0];
    } else {
      parameterNames = parameters.toArray(new String[0]);
    }
    
    context.getCurrentClass().addMethod(name, new InterpretedMethod(name, parameterNames, body));
    return CameliaRuntime.getNil();
  }
}