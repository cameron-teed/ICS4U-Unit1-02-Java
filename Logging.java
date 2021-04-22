/*
* The logging program determines how many logs a truck can carry if a log
* weighs 20kg/m and is either 0.25m, 0.5m or 1m and the truck can carry 1100kg.
*
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-22
* Class logging.
*/

import java.util.Scanner; // import scanner

final class Logging {

   private Logging() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * One of the accepted lengths of logs.
  */
  public static final double LEN1 = 0.25;
  /**
  * One of the accepted lengths of logs.
  */
  public static final double LEN2 = 0.5;
  /**
  * One of the accepted lengths of logs.
  */
  public static final float LEN3 = 1;
  /**
  * One of the accepted lengths of logs.
  */
  public static final float MASS = 55;
  /**
  * The logging program determines how many logs a truck can carry if a log
  * weighs 20kg/m and is either 0.25m, 0.5m or 1m and the truck can carry
  * 1100kg.
  * @param args
  */

  public static void main(final String[] args) {

    Scanner myObj = new Scanner(System.in);
    // ask for user input
    System.out.println("Enter log length (0.25, 0.5 or 1)");

    // checks if input is a float
    if (myObj.hasNextFloat()) {
      // Stores float in length
      float length = myObj.nextFloat();

      // Checks if you inputed the correct length
      if (length == LEN1 || length == LEN2 || length == LEN3) {
          // Outputs how many logs the truck can carry
          System.out.println("Therefore the truck will be able to take "
          + (MASS / (length)) +  " logs that are " + (length)
          + " meter(s) in length.");

        } else {
          // Outputs that the correct number needs to be inputed
          System.out.println("Please enter 0.25, 0.5 or 1");
          }

      } else {
          // Outputs that the correct number needs to be inputed
          System.out.println("Please enter 0.25, 0.5 or 1");
          }
  }
}
