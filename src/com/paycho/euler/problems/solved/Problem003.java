
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.BiggestPrimeFinder;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 implements ProblemWithTest<Long> {
  
  private static final Long NUMBER_TO_FACTOR = 600851475143L;
  
  private final BiggestPrimeFinder finder;
  
  @Inject
  public Problem003(BiggestPrimeFinder finder) {
    this.finder = finder;
  }

  @Override
  public void test() {
    finder.setNumberToFactor(20L);
    assertEquals((Long) 5L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(24L);
    assertEquals((Long) 3L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(1000L);
    assertEquals((Long) 5L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(1003L);
    assertEquals((Long) 59L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(92487024L);
    assertEquals((Long) 91753L, finder.getBiggestPrimeFactor());
  }
  
  @Override
  public Long solve() {
    finder.setNumberToFactor(NUMBER_TO_FACTOR);
    return finder.getBiggestPrimeFactor();
  }
}
