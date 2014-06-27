
package com.paycho.euler.math.division;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.inject.Inject;
import com.paycho.euler.math.primes.Factorizer;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class DivisibleNumberFinder {
  
  private final Multiset<Long> factors = HashMultiset.create();
  private final Factorizer factorizer;
  private Integer divisibleUpTo;
  
  @Inject
  public DivisibleNumberFinder(Factorizer factorizer) {
    this.factorizer = factorizer;
  }
  
  public Integer findDivisibleNumber() {
    for (long i = divisibleUpTo; i > 1; i--) {
      Multiset<Long> intermediateFactors = factorizer.factor(i);
      for (Multiset.Entry<Long> factor : intermediateFactors.entrySet()) {
        if (factor.getCount() > factors.count(factor.getElement())) {
          factors.setCount(factor.getElement(), factor.getCount());
        }
      }
    }
    Long multiple = 1L;
    for (Multiset.Entry<Long> factor : factors.entrySet()) {
      for (long i = 0; i < factor.getCount(); i++) {
        multiple *= factor.getElement();
      }
    }
    return multiple.intValue();
  }

  public void setDivisibleNumber(int divisibleUpTo) {
    this.divisibleUpTo = divisibleUpTo;
  }
}
