
package com.paycho.euler.math.division;

import com.paycho.euler.math.primes.Factorizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(MockitoJUnitRunner.class)
public class DivisibleNumberFinderTest {
 
  @Test
  public void testDivisibleNumberFinder() throws Exception {
    DivisibleNumberFinder finder = new DivisibleNumberFinder(new Factorizer());
    finder.setDivisibleNumber(10);
    assertEquals((Integer) 2520, finder.findDivisibleNumber());
  }
}
