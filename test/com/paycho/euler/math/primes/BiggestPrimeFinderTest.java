
package com.paycho.euler.math.primes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class BiggestPrimeFinderTest {
  
  @Test
  public void testPrimeFinding() {
    BiggestPrimeFinder finder = new BiggestPrimeFinder(20L);
    assertEquals((Integer) 5, finder.getBiggestPrimeFactor());
    finder = new BiggestPrimeFinder(24L);
    assertEquals((Integer) 3, finder.getBiggestPrimeFactor());
    finder = new BiggestPrimeFinder(1000L);
    assertEquals((Integer) 5, finder.getBiggestPrimeFactor());
    finder = new BiggestPrimeFinder(1003L);
    assertEquals((Integer) 59, finder.getBiggestPrimeFactor());
    finder = new BiggestPrimeFinder(92487024L);
    assertEquals((Integer) 91753, finder.getBiggestPrimeFactor());
  }
  
}
