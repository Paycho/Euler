package com.paycho.euler.problems;

import static org.junit.Assert.assertEquals;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?
 */
public class Problem015 implements ProblemWithTest<Long> {

  @Override
  public void test() {
    generatePathsSlow(2, 0, 0);
    assertEquals(6L, paths);
  }

  @Override
  public Long solve() {
    generatePathsSlow(20, 0, 0);
    return paths;
  }

  private long paths = 0L;

  /**
   * This is probably a shit way to do this. I'm SURE I'm missing something obvious with combinatorics, but
   * I got tired of thinking about it.
   *
   * NO. I'm missing something obvious with 1s and 0s. New solution inc.
   */
  public void generatePathsSlow(int size, int d, int r) {
    // Not thread safe, lel
    if (d == 0 && r == 0) {
      paths = 0L;
    }
    if (d == size && r == size) {
      ++paths;
      return;
    } else if (d == size) {
      generatePathsSlow(size, d, r + 1);
    } else if (r == size) {
      generatePathsSlow(size, d + 1, r);
    } else {
      generatePathsSlow(size, d + 1, r);
      generatePathsSlow(size, d, r + 1);
    }
  }


}
