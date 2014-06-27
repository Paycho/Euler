
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.PalindromeFinder;
import com.paycho.euler.problems.Problem;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem004 implements Problem<Integer> {
  
  private final PalindromeFinder finder;
  
  @Inject
  public Problem004(PalindromeFinder finder) {
    this.finder = finder;
  }
  
  public Integer solve() {
    return finder.findBiggestPalindrome(3);
  }
}
