
package com.paycho.euler.problems.onetotwenty;

import com.google.inject.Inject;
import com.paycho.euler.math.series.SumOfSquaresVsSquareOfSums;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem006 implements Problem<Integer> {
  
  private final SumOfSquaresVsSquareOfSums sumthingerDoober;
  
  @Inject
  public Problem006(SumOfSquaresVsSquareOfSums sumthingerDoober) {
    this.sumthingerDoober = sumthingerDoober;
  }
  
  @Override
  public Integer solve() {
    return sumthingerDoober.calculateDifference(100);
  }
}
