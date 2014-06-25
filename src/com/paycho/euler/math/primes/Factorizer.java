
package com.paycho.euler.math.primes;

import com.google.common.base.Stopwatch;
import com.google.common.collect.*;
import com.google.inject.Inject;
import com.paycho.euler.utils.annotations.Nullable;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Factorizer {

  private final Map<Long, Multiset<Long>> factors = Maps.newHashMap();

  public final static Stopwatch watch = Stopwatch.createUnstarted();

  /**
   * @param unfactored The number to factor
   * @return the list of numbers making up the prime factorization of the factorizer's unfactored
   * number.
   */
  public Multiset<Long> factor(Long unfactored) {
    watch.start();
    if (factors.containsKey(unfactored)) {
      watch.stop();
      return factors.get(unfactored);
    } else {
      Multiset<Long> newFactors = getFactors(unfactored);
      factors.put(unfactored, newFactors);
      watch.stop();
      return newFactors;
    }
  }

  /**
   * shamelessly pilfered from Joe's code.
   * @param unfactored
   * @return
   */
  private Multiset<Long> getFactors(Long unfactored) {
    Long factor = smallestFactor(unfactored);
    Multiset<Long> newFactors = HashMultiset.create();
    if (factor == unfactored) {
      newFactors.add(unfactored);
      return newFactors;
    }
    while (factor != unfactored && unfactored != 1) {
      factor = smallestFactor(unfactored);
      newFactors.add(factor);
      unfactored /= factor;
    }
    return newFactors;
  }

  // Prime tester values.
  private final ImmutableSet<Long> testValues = ImmutableSet.of(0L, 4L, 6L, 10L, 12L, 16L, 22L, 24L);

  private Long smallestFactor(Long unfactored) {
    if (unfactored % 2 == 0) {
      return 2L;
    } else if (unfactored % 3 == 0) {
      return 3L;
    } else if (unfactored % 5 == 0) {
      return 5L;
    }

    double limit = Math.sqrt(unfactored);
    for (long i = 7; i < limit; i += 30) {
      for (Long value : testValues) {
        if (unfactored % (i + value) == 0) {
          return (i + value);
        }
      }
    }
    return unfactored;
  }
}
