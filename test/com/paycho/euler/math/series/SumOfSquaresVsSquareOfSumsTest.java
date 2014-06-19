
package com.paycho.euler.math.series;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class SumOfSquaresVsSquareOfSumsTest {
  
  @Test
  public void testDifference() throws Exception {
    SumOfSquaresVsSquareOfSums differenceCalc = new SumOfSquaresVsSquareOfSums();
    assertEquals((Integer) 2640, differenceCalc.calculateDifference(10));
  }
}
