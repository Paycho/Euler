package com.paycho.euler.math.series;

import com.paycho.euler.math.division.Divisors;
import com.paycho.euler.math.primes.Factorizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class TriangleSeriesTest {

  private final TriangleSeries series = new TriangleSeries();

  @Test
  public void testTriangleNumberFinder() {
    assertEquals((Long) 15L, series.getTriangleNumber(5L));
  }

  @Test
  public void isThisATriangleNumberWtf() {
  }
}
