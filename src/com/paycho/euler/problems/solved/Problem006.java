
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.series.SumOfSquaresVsSquareOfSums;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640. Find the difference between the sum of the squares
 * of the first one hundred natural numbers and the square of the sum.
 */
public class Problem006 implements ProblemWithTest<Integer> {
  
  private final SumOfSquaresVsSquareOfSums sumthingerDoober;
  
  @Inject
  public Problem006(SumOfSquaresVsSquareOfSums sumthingerDoober) {
    this.sumthingerDoober = sumthingerDoober;
  }

  @Override
  public void test() {
    assertEquals((Integer) 2640, sumthingerDoober.calculateDifference(10));
  }
  
  @Override
  public Integer solve() {
    return sumthingerDoober.calculateDifference(100);
  }
}
