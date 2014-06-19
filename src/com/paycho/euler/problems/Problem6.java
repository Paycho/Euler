
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.series.SumOfSquaresVsSquareOfSums;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem6 implements Problem<Integer> {
  
  private final SumOfSquaresVsSquareOfSums sumthingerDoober;
  
  @Inject
  public Problem6(SumOfSquaresVsSquareOfSums sumthingerDoober) {
    this.sumthingerDoober = sumthingerDoober;
  }
  
  @Override
  public Integer solve() {
    return sumthingerDoober.calculateDifference(100);
  }
}
