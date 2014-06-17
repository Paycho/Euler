
package com.paycho.euler.problems;

import com.paycho.euler.math.PalindromeFinder;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class Problem4 implements Problem<Integer> {
  public Integer solve() {
    PalindromeFinder finder = new PalindromeFinder(3);
    return finder.findBiggestPalindrome();
  }
}
