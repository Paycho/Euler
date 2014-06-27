
package com.paycho.euler.problems.solved;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.paycho.euler.math.MultipleSummer;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 implements ProblemWithTest<Integer> {
  
  private static final Integer SUM_MULTIPLES_UNDER_NUMBER = 1000;
  private final MultipleSummer summer;
  
  @Inject
  public Problem001(MultipleSummer summer) {
    this.summer = summer;
  }

  @Override
  public void test() {
    summer.setMultipleNumber(10);
    assertEquals((Integer) 23, summer.getSum(ImmutableSet.of(3, 5)));
  }
  
  @Override
  public Integer solve() {
    summer.setMultipleNumber(SUM_MULTIPLES_UNDER_NUMBER);
    return summer.getSum(ImmutableSet.of(3, 5));
  }
}
