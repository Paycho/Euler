
package com.paycho.euler.math.primes;

import com.paycho.euler.utils.LongBitVector;
import java.util.BitSet;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class SieveOfEratosthenes implements Sieve {
  
  public Long findNthPrime(Long N) {
    // N*ln(N) is usually a decent estimate for how big the Nth prime will be, but adding
    // N* .50 to N will (hopefully) give us a number that's always a hair too big.
    Long estimatedCapacity = ((Double) ((N + (N * .50)) * Math.log(N))).longValue();
    BitSet primes = new BitSet(32);
    
    
    primes.set(0);
    primes.set(1);
    
    int primesFound = 1;
    long currentPrime = 2;
    while (primesFound != N) {
      for (long index = currentPrime*2; index < estimatedCapacity; index += currentPrime) {
        primes.set((int)index);
      }
      currentPrime++;
      boolean bit;
      while (bit = primes.get((int) currentPrime)) {
        currentPrime++;
      }
      ++primesFound;
    }
    return currentPrime;
  }
}
