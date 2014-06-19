
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.Sieve;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem7 implements Problem<Long> {
  
  private final Sieve sieve;
  
  @Inject
  public Problem7(Sieve sieve) {
    this.sieve = sieve;
  }
  
  public Long solve() {
    return sieve.findNthPrime(10001L);
  }
}
