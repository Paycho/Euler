
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.PalindromeFinder;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 4
 *
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 implements ProblemWithTest<Integer> {
  
  private final PalindromeFinder finder;
  
  @Inject
  public Problem004(PalindromeFinder finder) {
    this.finder = finder;
  }

  @Override
  public void test() {
    assertEquals((Integer) 9009, finder.findBiggestPalindrome(2));
  }
  
  public Integer solve() {
    return finder.findBiggestPalindrome(3);
  }
}
