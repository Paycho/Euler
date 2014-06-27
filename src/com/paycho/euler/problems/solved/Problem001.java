
package com.paycho.euler.problems.solved;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.paycho.euler.math.MultipleSummer;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem001 implements Problem<Integer> {
  
  private static final Integer SUM_MULTIPLES_UNDER_NUMBER = 1000;
  private final MultipleSummer summer;
  
  @Inject
  public Problem001(MultipleSummer summer) {
    this.summer = summer;
  }
  
  @Override
  public Integer solve() {
    summer.setMultipleNumber(SUM_MULTIPLES_UNDER_NUMBER);
    return summer.getSum(ImmutableSet.of(3, 5));
  }
}
