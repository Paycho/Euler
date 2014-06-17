
package com.paycho.euler.problems;

import com.google.common.collect.ImmutableSet;
import com.paycho.euler.math.MultipleSummer;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem1 implements Problem<Integer> {
  
  private static final Integer SUM_MULTIPLES_UNDER_NUMBER = 1000;
  
  @Override
  public Integer solve() {
    MultipleSummer summer = new MultipleSummer(SUM_MULTIPLES_UNDER_NUMBER);
    return summer.getSum(ImmutableSet.of(3, 5));
  }
}
