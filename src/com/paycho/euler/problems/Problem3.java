
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.BiggestPrimeFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem3 implements Problem<Long> {
  
  private static final Long NUMBER_TO_FACTOR = 600851475143L;
  
  private final BiggestPrimeFinder finder;
  
  @Inject
  public Problem3(BiggestPrimeFinder finder) {
    this.finder = finder;
  }
  
  @Override
  public Long solve() {
    finder.setNumberToFactor(NUMBER_TO_FACTOR);
    return finder.getBiggestPrimeFactor();
  }
}
