package com.paycho.euler.problems.onetotwenty;

import com.google.inject.Inject;
import com.paycho.euler.math.division.Divisors;
import com.paycho.euler.math.primes.Factorizer;
import com.paycho.euler.math.series.TriangleSeries;
import com.paycho.euler.problems.Problem;

public class Problem012 implements Problem<String> {

  private final TriangleSeries series;
  private final Divisors divisors;

  @Inject
  public Problem012(TriangleSeries series, Divisors divisors) {
    this.series = series;
    this.divisors = divisors;
  }

  @Override
  public String solve() {
    Long initialNumberOfDivisors = 1L;
    Long squarePositionInSeries = 2L;
    Long triangleNumber = 1L;
    Long nthNumber = 0L;

    // First estimate the triangle number we need based on stepping by perfect squares through the triangle number
    // series.
    while (initialNumberOfDivisors <= 500L) {
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
        if (candidateDivisors > 500L && candidateDivisors != initialNumberOfDivisors) {
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
