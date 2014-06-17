
package com.paycho.euler.math.division;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class DivisibleNumberFinderTest {
  
  @Test
  public void testDivisibleNumberFinder() throws Exception {
    DivisibleNumberFinder finder = new DivisibleNumberFinder(10);
    assertEquals((Integer) 2520, finder.findDivisibleNumber());
  }
}
