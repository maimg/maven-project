
/**
* This package has non null parameters and is documented.
**/
@ParametersAreNonnullByDefault
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
   * @param someone String
   * @return String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
