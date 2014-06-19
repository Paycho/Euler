
package com.paycho.euler.math.series;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class SumOfSquaresVsSquareOfSums {
  
  public Integer calculateDifference(Integer n) {
    Integer difference = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        difference += 2*i*j;
      }
    }
    return difference;
  }
}
