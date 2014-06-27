
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.Sieve;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem007 implements Problem<Long> {
  
  private final Sieve sieve;
  
  @Inject
  public Problem007(Sieve sieve) {
    this.sieve = sieve;
  }
  
  public Long solve() {
    return sieve.findNthPrime(10001L);
  }
}
