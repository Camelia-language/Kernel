package org.kernel.camelia.language;

import java.util.HashMap;
import java.io.Reader;
import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.kernel.camelia.language.nodes.Node;


/**
  Evaluation context. Determines how a node will be evaluated.
  A context tracks local variables, self, and the current class under which
  methods and constants will be added.
  
  There are three different types of context:
  1) In the root of the script, self = main object, class = Object
  2) Inside a method body, self = instance of the class, class = method class
  3) Inside a class definition self = the class, class = the class
*/
public class Context {
  private CameliaObject currentSelf;
  private CameliaClass currentClass;
  private HashMap<String, CameliaObject> locals;
  // A context can share local variables with a parent. For example, in the
  // try block.
  private Context parent;
  
  public Context(CameliaObject currentSelf, CameliaClass currentClass, Context parent) {
    this.currentSelf = currentSelf;
    this.currentClass = currentClass;
    this.parent = parent;
    if (parent == null) {
      locals = new HashMap<String, CameliaObject>();
    } else {
      locals = parent.locals;
    }
  }
  
  public Context(CameliaObject currentSelf, CameliaClass currentClass) {
    this(currentSelf, currentClass, null);
  }
  
  public Context(CameliaObject currentSelf) {
    this(currentSelf, currentSelf.getCameliaClass());
  }
  
  public Context() {
    this(CameliaRuntime.getMainObject());
  }
  
  public CameliaObject getCurrentSelf() {
    return currentSelf;
  }

  public CameliaClass getCurrentClass() {
    return currentClass;
  }
  
  public CameliaObject getLocal(String name) {
    return locals.get(name);
  }
    
  public boolean hasLocal(String name) {
    return locals.containsKey(name);
  }
    
  public void setLocal(String name, CameliaObject value) {
    locals.put(name, value);
  }
  
  /**
    Creates a context that will share the same attributes (locals, self, class)
    as the current one.
  */
  public Context makeChildContext() {
    return new Context(currentSelf, currentClass, this);
  }
  
  /**
    Parse and evaluate the content red from the reader (eg.: FileReader, StringReader).
  */
  public CameliaObject eval(Reader reader) throws CameliaException {
    try {
      CameliaLexer lexer = new CameliaLexer(new ANTLRReaderStream(reader));
      CameliaParser parser = new CameliaParser(new CommonTokenStream(lexer));
      Node node = parser.parse();
      if (node == null) return CameliaRuntime.getNil();
      return node.eval(this);
    } catch (CameliaException e) {
      throw e;
    } catch (Exception e) {
      throw new CameliaException(e);
    }
  }
  
  public CameliaObject eval(String code) throws CameliaException {
    return eval(new StringReader(code));
  }
}
