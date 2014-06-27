
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.division.DivisibleNumberFinder;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem005 implements ProblemWithTest<Integer> {
  
  private final DivisibleNumberFinder finder;
  
  @Inject
  public Problem005(DivisibleNumberFinder finder) {
    this.finder = finder;
  }

  @Override
  public void test() {
    finder.setDivisibleNumber(10);
    assertEquals((Integer) 2520, finder.findDivisibleNumber());
  }

  @Override
  public Integer solve() {
    finder.setDivisibleNumber(20);
    return finder.findDivisibleNumber();
  }
}
