
package com.paycho.euler.math.primes;

import com.paycho.euler.utils.annotations.Nullable;
import java.util.BitSet;

/**
 * A quick and dirty implementation of a sieve of eratosthenes 
 * @author Paycho <paycho@paycho.org>
 */
public class SieveOfEratosthenes implements Sieve {
  
  public Long sumPrimesBelow(Long N) {
    BitSet primes = new BitSet(32);
    generatePrimes(N, primes, null);
    Long sum = 0L;
    for (int i = 0; i < N; i++) {
      if (!primes.get(i)) {
        sum += i;
      }
    }
    return sum;
  }
  
  public Long findNthPrime(Long N) {
    // N*ln(N) is usually a decent estimate for how big the Nth prime will be, but adding
    // N* .50 to N will (hopefully) give us a number that's always a hair too big.
    Long estimatedCapacity = ((Double) ((N + (N * .50)) * Math.log(N))).longValue();
    BitSet primes = new BitSet(32);
    return generatePrimes(estimatedCapacity, primes, N);
  }
  
  private Long generatePrimes(Long limit, BitSet primes, @Nullable Long stopAfter) {
    
    primes.set(0);
    primes.set(1);
    int primesFound = 1;
    long currentPrime = 2;
    while (stopAfter == null ? primesFound < limit : primesFound != stopAfter) {
      for (long index = currentPrime*2; index < limit; index += currentPrime) {
        primes.set((int)index);
      }
      currentPrime++;
      while (primes.get((int) currentPrime)) {
        currentPrime++;
        if (currentPrime > limit) {
          return currentPrime;
        }
      }
      ++primesFound;
    }
    return currentPrime;
  }
}
