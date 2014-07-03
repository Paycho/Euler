package com.paycho.euler.problems;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.paycho.euler.utils.MoreMath;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?
 */
public class Problem015 implements ProblemWithTest<Long> {

  @Override
  public void test() {
    assertEquals(6L, generatePaths(2));
  }

  @Override
  public Long solve() {
    return generatePaths(20);
  }

  /**
   * This is probably a shit way to do this. I'm SURE I'm missing something obvious with combinatorics, but
   * I got tired of thinking about it.
   */
  public long generatePathsSlow(int size, int d, int r) {
    // Not thread safe, lel
    if (d == size && r == size) {
      return 1L;
    } else if (d == size) {
      return generatePathsSlow(size, d, r + 1);
    } else if (r == size) {
      return generatePathsSlow(size, d + 1, r);
    } else {
      return generatePathsSlow(size, d + 1, r) + generatePathsSlow(size, d, r + 1);
    }
  }

  /**
   * ... and the combinatorics way, which I totally had working until I mistyped something the first time I coded it,
   * and then gave up and implemented the slow way. I'm retarded.
   *
   * I actually had a pretty clever solution representing the paths as binary numbers, where you had to have an equal
   * number of 1s and 0s in it to be a valid path, but then I was like "wait, I'm pretty sure I'm retarded". Yep.
   */
  public long generatePaths(int size) {
    return (MoreMath.factorial(2*size).divide((
        MoreMath.factorial(size).multiply(MoreMath.factorial(2*size - size))))).longValue();
  }

}
