
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
  
  private final Multiset<Integer> factors = HashMultiset.create();
  private final Factorizer factorizer;
  private Integer divisibleUpTo;
  
  @Inject
  public DivisibleNumberFinder(Factorizer factorizer) {
    this.factorizer = factorizer;
  }
  
  public Integer findDivisibleNumber() {
    for (int i = divisibleUpTo; i > 1; i--) {
      Multiset<Integer> intermediateFactors = factorizer.factor(i);
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

  public void setDivisibleNumber(int divisibleUpTo) {
    this.divisibleUpTo = divisibleUpTo;
  }
}
