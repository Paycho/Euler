
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.powers.PythagoreanTriplet;
import java.util.Set;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem9 implements Problem<Set<Long>> {
  
  private final PythagoreanTriplet finder;
  
  @Inject
  public Problem9(PythagoreanTriplet finder) {
    this.finder = finder;
  }
  
  public Set<Long> solve() {
    return finder.findTriplet(1000L);
  }
}
