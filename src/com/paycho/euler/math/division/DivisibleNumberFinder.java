
package com.paycho.euler.math.division;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.paycho.euler.math.primes.Factorizer;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class DivisibleNumberFinder {
  
  private final Multiset<Integer> factors = HashMultiset.create();
  private final Integer divisibleUpTo;
  
  public DivisibleNumberFinder(Integer divisibleUpTo) {
    this.divisibleUpTo = divisibleUpTo;
  }
  
  public Integer findDivisibleNumber() {
    for (int i = divisibleUpTo; i > 1; i--) {
      Multiset<Integer> intermediateFactors = new Factorizer(i).factor();
      for (Multiset.Entry<Integer> factor : intermediateFactors.entrySet()) {
        if (factor.getCount() > factors.count(factor.getElement())) {
          factors.setCount(factor.getElement(), factor.getCount());
        }
      }
    }
    Integer multiple = 1;
    for (Multiset.Entry<Integer> factor : factors.entrySet()) {
      for (int i = 0; i < factor.getCount(); i++) {
        multiple *= factor.getElement();
      }
    }
    return multiple;
  }
}
