package org.kernel.camelia.language;

import java.io.*;

/**
  Bootstrapper.run() is called to initialize the runtime.
  Core classes are created and methods are added.
*/
public class Bootstrapper {
  static public Context run() {
    // Create core classes
    CameliaClass objectClass = new CameliaClass("Object");
    CameliaRuntime.objectClass = objectClass;
    // Each method sent or added on the root context of a script are evaled on the main object.
    CameliaObject main = new CameliaObject();
    CameliaRuntime.mainObject = main;
    CameliaClass classClass = new CameliaClass("Class");
    objectClass.setCameliaClass(classClass); // Object is a class
    classClass.setCameliaClass(classClass); // Class is a class
    main.setCameliaClass(objectClass);
    
    // Register core classes into the root context
    objectClass.setConstant("Object", objectClass);
    objectClass.setConstant("Class", classClass);
    // There is just one instance of nil, true, false, so we store those in constants.
    CameliaRuntime.nilObject = objectClass.newSubclass("NilClass").newInstance(null);
    CameliaRuntime.trueObject = objectClass.newSubclass("TrueClass").newInstance(true);
    CameliaRuntime.falseObject = objectClass.newSubclass("FalseClass").newInstance(false);
    CameliaClass stringClass = objectClass.newSubclass("String");
    CameliaClass numberClass = objectClass.newSubclass("Number");
    CameliaClass integerClass = numberClass.newSubclass("Integer");
    CameliaClass floatClass = numberClass.newSubclass("Float");
    CameliaClass exceptionClass = objectClass.newSubclass("Exception");
    exceptionClass.newSubclass("IOException");
    exceptionClass.newSubclass("TypeError");
    exceptionClass.newSubclass("MethodNotFound");
    exceptionClass.newSubclass("ArgumentError");
    exceptionClass.newSubclass("FileNotFound");
    
    // Add methods to core classes.
    
    //// Object
    objectClass.addMethod("print", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        for (CameliaObject arg : arguments) System.out.println(arg.toJavaObject());
        return CameliaRuntime.getNil();
      }
    });
    objectClass.addMethod("class", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        return receiver.getCameliaClass();
      }
    });
    objectClass.addMethod("eval", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        Context context = new Context(receiver);
        String code = arguments[0].asString();
        return context.eval(code);
      }
    });
    objectClass.addMethod("require", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        Context context = new Context();
        String filename = arguments[0].asString();
        try {
          return context.eval(new FileReader(filename));
        } catch (FileNotFoundException e) {
          throw new CameliaException("FileNotFound", "File not found: " + filename);
        }
      }
    });
    
    //// Class
    classClass.addMethod("new", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        CameliaClass self = (CameliaClass) receiver;
        CameliaObject instance = self.newInstance();
        if (self.hasMethod("initialize")) instance.call("initialize", arguments);
        return instance;
      }
    });
    classClass.addMethod("name", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        CameliaClass self = (CameliaClass) receiver;
        return new ValueObject(self.getName());
      }
    });
    classClass.addMethod("superclass", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        CameliaClass self = (CameliaClass) receiver;
        return self.getSuperClass();
      }
    });

    //// Exception
    exceptionClass.addMethod("initialize", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        if (arguments.length == 1) receiver.setInstanceVariable("message", arguments[0]);
        return CameliaRuntime.getNil();
      }
    });
    exceptionClass.addMethod("message", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        return receiver.getInstanceVariable("message");
      }
    });
    objectClass.addMethod("raise!", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        String message = null;
        if (receiver.hasInstanceVariable("message")) message = receiver.getInstanceVariable("message").asString();
        throw new CameliaException(receiver.getCameliaClass(), message);
      }
    });
    
    //// Integer
    integerClass.addMethod("+", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return new ValueObject(receiver + argument);
      }
    });
    integerClass.addMethod("-", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return new ValueObject(receiver + argument);
      }
    });
    integerClass.addMethod("*", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return new ValueObject(receiver * argument);
      }
    });
    integerClass.addMethod("/", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return new ValueObject(receiver / argument);
      }
    });
    integerClass.addMethod("<", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return CameliaRuntime.toBoolean(receiver < argument);
      }
    });
    integerClass.addMethod(">", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return CameliaRuntime.toBoolean(receiver > argument);
      }
    });
    integerClass.addMethod("<=", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return CameliaRuntime.toBoolean(receiver <= argument);
      }
    });
    integerClass.addMethod(">=", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return CameliaRuntime.toBoolean(receiver >= argument);
      }
    });
    integerClass.addMethod("==", new OperatorMethod<Integer>() {
      public CameliaObject perform(Integer receiver, Integer argument) throws CameliaException {
        return CameliaRuntime.toBoolean(receiver == argument);
      }
    });
    
    //// String
    stringClass.addMethod("+", new OperatorMethod<String>() {
      public CameliaObject perform(String receiver, String argument) throws CameliaException {
        return new ValueObject(receiver + argument);
      }
    });
    stringClass.addMethod("size", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        String self = receiver.asString();
        return new ValueObject(self.length());
      }
    });
    stringClass.addMethod("substring", new Method() {
      public CameliaObject call(CameliaObject receiver, CameliaObject arguments[]) throws CameliaException {
        String self = receiver.asString();
        if (arguments.length == 0) throw new ArgumentError("substring", 1, 0);
        int start = arguments[0].asInteger();
        int end = self.length();
        if (arguments.length > 1) end = arguments[1].asInteger();
        return new ValueObject(self.substring(start, end));
      }
    });
    
    // Return the root context on which everything will be evaled. By default, everything is evaled on the
    // main object.
    return new Context(main);
  }
}