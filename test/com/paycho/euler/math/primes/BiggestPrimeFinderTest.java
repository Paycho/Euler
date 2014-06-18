
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
    BiggestPrimeFinder finder = new BiggestPrimeFinder();
    finder.setNumberToFactor(20L);
    assertEquals((Long) 5L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(24L);
    assertEquals((Long) 3L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(1000L);
    assertEquals((Long) 5L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(1003L);
    assertEquals((Long) 59L, finder.getBiggestPrimeFactor());
    finder.setNumberToFactor(92487024L);
    assertEquals((Long) 91753L, finder.getBiggestPrimeFactor());
  }
  
}
