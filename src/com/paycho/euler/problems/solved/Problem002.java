
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.series.FibonacciSummer;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 2
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem002 implements ProblemWithTest<Integer> {
  
  public static final Integer MAXIMUM_FIBONACCI_NUMBER = 4000000;
  
  private final FibonacciSummer summer;
  
  @Inject
  public Problem002(FibonacciSummer summer) {
    this.summer = summer;
  }

  @Override
  public void test() {
    summer.setMaximumNumber(10);
    assertEquals((Integer) 10, summer.findSum());
  }
  
  @Override
  public Integer solve() {
    summer.setMaximumNumber(MAXIMUM_FIBONACCI_NUMBER);
    return summer.findSum();
  }
}
