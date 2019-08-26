# Kernel
Camelia's kernel (best kernel ever!)

This project serves as a base for creating a programming language on top of
the JVM base of the work of Marc-Andre Cournoyer

Requirements
============
You must have the following tools installed:
* Java 1.5 or greater (http://www.java.com/en/download/index.jsp)
* Ant 1.7 or greater (http://ant.apache.org/)
* Ruby 1.8 or greater (http://www.ruby-lang.org)


Getting Started
===============

To compile the application, from the root of the project, run:

  ant

You can then execute code:

  bin/camelia -e "some code"
  bin/camelia some_file.yl


Structure of the language
=========================
The runtime model of the language is largely inspired by Ruby. See comments in
source files for more details.

* Everything is on object.
* Each object (CameliaObject) has a class (CameliaClass).
* Objects that relate to Java values (String, Integer, Float, etc) are stored
  in a ValueObject instance.
* The lexer and parser grammars (.g files) are compiled by ANTLR
  (http://www.antlr.org/)
* The parser creates custom nodes (under src/org/kernel/camelia/language/nodes) each one 
  implementing the eval method.
* Each node is evaled on an instance of the Context class.
* Methods of Camelia objects are created in Boostrapper.java.


Language Syntax
===============
The syntax is, again, inspired by Ruby. See the files under test/ for example
use of the language.


(c) 2009 Marc-Andre Cournoyer
(c) 2015 Lopez Jimmy
See LICENSE for legal information
