
package com.paycho.euler.math.primes;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.inject.Inject;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Factorizer {
  private final Multiset<Integer> factors = HashMultiset.create();
  
  @Inject
  public Factorizer() {
  }
  
  /**
   * @param unfactored The number to factor
   * @return the list of numbers making up the prime factorization of the factorizer's unfactored
   * number.
   */
  public Multiset<Integer> factor(Integer unfactored) {
    factors.clear();
    getFactors(unfactored);
    return HashMultiset.create(factors);
  }
  
  private void getFactors(Integer remainder) {
    for (int i = 2; i <= remainder/2; i++) {
      if (remainder % i == 0) {
        factors.add(i);
        getFactors(remainder/i);
        return;
      }
    }
    factors.add(remainder);
  }
}
