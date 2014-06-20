
package com.paycho.euler.math.powers;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class PythagoreanTriplet {
  
  
  /**
   * Finds a pythagorean triplet with numbers that sum to the given value. Returns the empty
   * set if no such numbers satisfying the constraint exist.
   * 
   * @param sum
   * @return 
   */
  public Set<Long> findTriplet(Long sum) {
    Long a = 0L, b = 0L, c = 0L;
    for (c = sum - 2; c > 2; c--) {
      for (b = (sum - c) - 1; b >= a; b--) {
        if (b > c) {
          b = c - 1;
        }
        a = (sum - c) - b;
        if (a*a + b*b == c*c) {
          return ImmutableSet.of(a, b, c);
        }
        
      }
    }
    return ImmutableSet.of();
  }
}
