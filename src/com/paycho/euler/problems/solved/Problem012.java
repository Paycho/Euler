package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.division.Divisors;
import com.paycho.euler.math.primes.Factorizer;
import com.paycho.euler.math.series.TriangleSeries;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertTrue;

/**
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be:
 *
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
 *
 * The first ten terms would be:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 *
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem012 implements ProblemWithTest<String> {

  private final TriangleSeries series;
  private final Divisors divisors;

  @Inject
  public Problem012(TriangleSeries series, Divisors divisors) {
    this.series = series;
    this.divisors = divisors;
  }

  @Override
  public void test() {
    assertTrue(value(5L).contains("28, and number of divisors: 6, at position: 8 with this amount"));
  }

  @Override
  public String solve() {
    return value(500L);
  }

  private String value(Long divisorNumber) {
    Long initialNumberOfDivisors = 1L;
    Long squarePositionInSeries = 2L;
    Long triangleNumber = 1L;
    Long nthNumber = 0L;

    // First estimate the triangle number we need based on stepping by perfect squares through the triangle number
    // series.
    while (initialNumberOfDivisors <= divisorNumber) {
      nthNumber = (squarePositionInSeries * squarePositionInSeries) - 1L;
      triangleNumber = series.getTriangleNumber(nthNumber);
      initialNumberOfDivisors = divisors.of(triangleNumber);
      squarePositionInSeries++;
    }
    squarePositionInSeries -= 2;

    // Now, walk back to the last square - 1 repeatedly and find the first triangle number over 500. This is fast, since
    // we've already computed all the values for the triangle numbers up to this one.
    long previousSquare = 0;
    long candidateDivisors = 0;
    long candidateTriangleNumber = 0;
    while (true) {
      previousSquare = squarePositionInSeries * squarePositionInSeries - 1;
      for (long candidatePosition = nthNumber; candidatePosition > previousSquare; candidatePosition--) {
        candidateTriangleNumber = series.getTriangleNumber(candidatePosition);
        candidateDivisors = divisors.of(candidateTriangleNumber);
        nthNumber = candidatePosition;
        if (candidateDivisors > divisorNumber && candidateDivisors != initialNumberOfDivisors) {
          triangleNumber = candidateTriangleNumber;
          nthNumber = candidatePosition;
          return triangleNumber.toString() +
              ", and number of divisors: " + candidateDivisors +
              ", at position: " + nthNumber +
              " with this amount of time spent factoring: " + Factorizer.watch;
        }
      }
      squarePositionInSeries--;
    }
  }
}
