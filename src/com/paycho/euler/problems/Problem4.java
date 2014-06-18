
package com.paycho.euler.problems;

import com.google.inject.Inject;
import com.paycho.euler.math.PalindromeFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem4 implements Problem<Integer> {
  
  private final PalindromeFinder finder;
  
  @Inject
  public Problem4(PalindromeFinder finder) {
    this.finder = finder;
  }
  
  public Integer solve() {
    return finder.findBiggestPalindrome(3);
  }
}
