package com.paycho.euler.math.division;

import com.google.common.collect.Multiset;
import com.google.inject.Inject;
import com.paycho.euler.math.primes.Factorizer;

public class Divisors {

  private final Factorizer factorizer;

  @Inject
  public Divisors(Factorizer factorizer) {
    this.factorizer = factorizer;
  }

  // Divisors.of uses my existing prime factorization code to get the number of positive divisors of
  // an input number, based on the number of multiplicative permutations of its prime factorization.
  public Long of(Long number) {
    Multiset<Long> factors = factorizer.factor(number);
    Long divisors = 1L;
    for (Multiset.Entry<Long> entry : factors.entrySet()) {
      divisors *= entry.getCount() + 1;
    }
    return divisors;
  }
}
