package com.paycho.euler.math.series;

import com.paycho.euler.math.series.FibonacciSummer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class FibonacciSummerTest {
  
  @Test
  public void testFibonacciSum() throws Exception {
    FibonacciSummer summer = new FibonacciSummer(10);
    assertEquals((Integer) 10, summer.findSum());
  }
}
