
package com.paycho.euler.problems;

import com.paycho.euler.math.series.FibonacciSummer;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem2 implements Problem<Integer> {
  
  public static final Integer MAXIMUM_FIBONACCI_NUMBER = 4000000;
  
  @Override
  public Integer solve() {
    FibonacciSummer summer = new FibonacciSummer(MAXIMUM_FIBONACCI_NUMBER);
    return summer.findSum();
  }
}
