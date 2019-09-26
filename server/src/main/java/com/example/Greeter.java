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

  /**
   * Info about this method doing something for package-info.java file.
   */
  public abstract String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
