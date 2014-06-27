
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.powers.PythagoreanTriplet;
import com.paycho.euler.problems.Problem;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem009 implements Problem<Set<Long>> {
  
  private final PythagoreanTriplet finder;
  
  @Inject
  public Problem009(PythagoreanTriplet finder) {
    this.finder = finder;
  }
  
  public Set<Long> solve() {
    return finder.findTriplet(1000L);
  }
}
