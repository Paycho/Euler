
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.TheGrid;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem011 implements Problem<Long> {
  
  private final TheGrid theGrid;
  
  @Inject
  public Problem011(TheGrid theGrid) {
    this.theGrid = theGrid;
  }
  
  @Override
  public Long solve() {
    return theGrid.findGreatestProduct(4L);
  }
  
}
