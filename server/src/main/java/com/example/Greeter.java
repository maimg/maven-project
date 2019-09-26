
/**
 * Domain classes 
 * @since 1.0
 * @author jwhite
 * @version 1.1
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
   * @param String someone
   * @return String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
