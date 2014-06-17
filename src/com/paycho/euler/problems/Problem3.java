
package com.paycho.euler.problems;

import com.paycho.euler.math.primes.BiggestPrimeFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem3 implements Problem<Long> {
  
  private static final Long NUMBER_TO_FACTOR = 600851475143L;
  
  @Override
  public Long solve() {
    BiggestPrimeFinder finder = new BiggestPrimeFinder(NUMBER_TO_FACTOR);
    return finder.getBiggestPrimeFactor();
  }
}
