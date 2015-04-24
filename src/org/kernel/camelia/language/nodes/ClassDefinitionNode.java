package org.kernel.camelia.language.nodes;


import org.kernel.camelia.language.CameliaClass;
import org.kernel.camelia.language.CameliaException;
import org.kernel.camelia.language.CameliaObject;
import org.kernel.camelia.language.Context;

public class ClassDefinitionNode extends Node {
  private String name;
  private String superName;
  private Node body;
  
  public ClassDefinitionNode(String name, String superName, Node body) {
    this.name = name;
    this.superName = superName;
    this.body = body;
  }
  
  public CameliaObject eval(Context context) throws CameliaException {
    CameliaClass klass;
    // Default superclass to Object.
    if (superName == null) {
      klass = new CameliaClass(name);
    } else {
      CameliaClass superClass = (CameliaClass) context.getCurrentClass().getConstant(superName);
      klass = new CameliaClass(name, superClass);
    }
    
    // Evaluated the body of the class with self=class and class=class.
    body.eval(new Context(klass, klass));
    // Add the class as a constant
    context.getCurrentClass().setConstant(name, klass);
    
    return klass;
  }
}