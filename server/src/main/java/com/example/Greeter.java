/**
 * Info about this package doing something for package-info.java file.
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public abstract String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
