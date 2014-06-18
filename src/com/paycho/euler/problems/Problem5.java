
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.division.DivisibleNumberFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem5 implements Problem<Integer> {
  
  private final DivisibleNumberFinder finder;
  
  @Inject
  public Problem5(DivisibleNumberFinder finder) {
    this.finder = finder;
  }
  
  public Integer solve() {
    finder.setDivisibleNumber(20);
    return finder.findDivisibleNumber();
  }
}
