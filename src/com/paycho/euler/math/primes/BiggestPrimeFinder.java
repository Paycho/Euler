
package com.paycho.euler.math.primes;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class BiggestPrimeFinder {
  private final Set<Long> knownPrimes = Sets.newHashSet();
  private final Set<Long> seen = Sets.newHashSet();
  private final Set<Long> newPrimes = Sets.newHashSet();
  
  private Long largestPrime;
  
  private Long inputNumber;
  
  @Inject
  public BiggestPrimeFinder() {
  }
  
  public Long getBiggestPrimeFactor() {
    largestPrime = 2L;
    discoverPrimes(inputNumber);
    return largestPrime;
  }
  
  private void addPrime(Long newPrime) {
    // Sanity check here by looking at % newPrime
    if (largestPrime < newPrime && inputNumber % newPrime == 0) {
      largestPrime = newPrime;
    }
    seen.add(newPrime);
    newPrimes.add(newPrime);
  }
  
  private void discoverPrimes(Long remainder) {
    for (long i = 2; i < remainder/2; i++) {
      if (remainder % i == 0) {
        addPrime(i);
        discoverPrimes(remainder/i);
        return;
      }
    }
    addPrime(remainder);
  }

  public void setNumberToFactor(Long inputNumber) {
    this.inputNumber = inputNumber;
  }
}
