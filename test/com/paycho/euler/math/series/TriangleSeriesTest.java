package com.paycho.euler.math.series;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

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
