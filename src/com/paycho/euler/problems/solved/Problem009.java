
package com.paycho.euler.problems.solved;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.paycho.euler.math.powers.PythagoreanTriplet;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.ProblemWithTest;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 2^5 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *
 * Find the product abc.
 */
public class Problem009 implements ProblemWithTest<Set<Long>> {
  
  private final PythagoreanTriplet finder;
  
  @Inject
  public Problem009(PythagoreanTriplet finder) {
    this.finder = finder;
  }

  @Override
  public void test() {
    Set<Long> answer = finder.findTriplet(12L);
    assertEquals(ImmutableSet.of(3L, 4L, 5L), answer);
  }

  @Override
  public Set<Long> solve() {
    return finder.findTriplet(1000L);
  }
}
