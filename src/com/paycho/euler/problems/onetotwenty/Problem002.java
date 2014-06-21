
package com.paycho.euler.problems.onetotwenty;

import com.google.inject.Inject;
import com.paycho.euler.math.series.FibonacciSummer;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem002 implements Problem<Integer> {
  
  public static final Integer MAXIMUM_FIBONACCI_NUMBER = 4000000;
  
  private final FibonacciSummer summer;
  
  @Inject
  public Problem002(FibonacciSummer summer) {
    this.summer = summer;
  }
  
  @Override
  public Integer solve() {
    summer.setMaximumNumber(MAXIMUM_FIBONACCI_NUMBER);
    return summer.findSum();
  }
}
