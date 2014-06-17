
package com.paycho.euler.math.primes;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Factorizer {
  private final Integer unfactored;
  private final Multiset<Integer> factors = HashMultiset.create();
  
  public Factorizer(Integer unfactored) {
    this.unfactored = unfactored;
  }
  
  /**
   * @return the list of numbers making up the prime factorization of the factorizer's unfactored
   * number.
   */
  public Multiset<Integer> factor() {
    factor(unfactored);
    return factors;
  }
  
  private void factor(Integer remainder) {
    for (int i = 2; i <= remainder/2; i++) {
      if (remainder % i == 0) {
        factors.add(i);
        factor(remainder/i);
        return;
      }
    }
    factors.add(remainder);
  }
}
