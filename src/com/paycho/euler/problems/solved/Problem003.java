
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.BiggestPrimeFinder;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem003 implements Problem<Long> {
  
  private static final Long NUMBER_TO_FACTOR = 600851475143L;
  
  private final BiggestPrimeFinder finder;
  
  @Inject
  public Problem003(BiggestPrimeFinder finder) {
    this.finder = finder;
  }
  
  @Override
  public Long solve() {
    finder.setNumberToFactor(NUMBER_TO_FACTOR);
    return finder.getBiggestPrimeFactor();
  }
}
