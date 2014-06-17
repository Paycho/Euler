
package com.paycho.euler.problems;

import com.paycho.euler.math.division.DivisibleNumberFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem5 implements Problem<Integer> {
  public Integer solve() {
    DivisibleNumberFinder finder = new DivisibleNumberFinder(20);
    return finder.findDivisibleNumber();
  }
}
