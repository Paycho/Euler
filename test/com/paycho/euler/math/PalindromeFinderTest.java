
package com.paycho.euler.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class PalindromeFinderTest {
  
  @Test
  public void testPalindrome() throws Exception {
    PalindromeFinder finder = new PalindromeFinder();
    assertEquals((Integer) 9009, finder.findBiggestPalindrome(2));
  }
}
