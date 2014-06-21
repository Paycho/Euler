
package com.paycho.euler.problems.onetotwenty;

import com.google.inject.Inject;
import com.paycho.euler.math.division.DivisibleNumberFinder;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem005 implements Problem<Integer> {
  
  private final DivisibleNumberFinder finder;
  
  @Inject
  public Problem005(DivisibleNumberFinder finder) {
    this.finder = finder;
  }
  
  public Integer solve() {
    finder.setDivisibleNumber(20);
    return finder.findDivisibleNumber();
  }
}
