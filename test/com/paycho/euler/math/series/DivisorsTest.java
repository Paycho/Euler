package com.paycho.euler.math.series;

import com.paycho.euler.math.division.Divisors;
import com.paycho.euler.math.primes.Factorizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DivisorsTest {

  @Test
  public void testDivisors() {
    TriangleSeries series = new TriangleSeries();
    Divisors divisors = new Divisors(new Factorizer());
    assertEquals((Long) 6L, divisors.of(28L));
    assertEquals((Long) 4L, divisors.of(series.getTriangleNumber(5L)));
    assertEquals((Long) 16L, divisors.of(series.getTriangleNumber(15L)));
    assertEquals((Long) 18L, divisors.of(series.getTriangleNumber(24L)));
  }
}
