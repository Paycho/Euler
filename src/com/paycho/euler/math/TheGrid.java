
package com.paycho.euler.math;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class TheGrid {

  private Long largestProduct = 0L;
  private Long xPoint, yPoint;
  private String direction;
  private Integer[][] grid;

  public Long findGreatestProduct(Long consecutiveNumber) {
    largestProduct = 0L;
    Long mod = consecutiveNumber - 1;
    for (Long x = 0L; x < grid.length; x++) {
      for (Long y = 0L; y < grid[x.intValue()].length; y++) {
        Long testValue = horizontal(x, y, mod);
        if (testValue > largestProduct) {
          largestProduct = testValue;
          direction = "horizontal";
          xPoint = x;
          yPoint = y;
        }
        testValue = vertical(x, y, mod);
        if (testValue > largestProduct) {
          largestProduct = testValue;
          direction = "vertical";
          xPoint = x;
          yPoint = y;
        }
        testValue = diagonal(x, y, mod);
        if (testValue > largestProduct) {
          largestProduct = testValue;
          direction = "diagonal";
          xPoint = x;
          yPoint = y;
        }
      }
    }
    //System.out.println(
    //   "Largest: " + largestProduct + " direction: " + direction + " location: " + xPoint + "," + yPoint);
    return largestProduct;
  }

  private Long horizontal(Long x, Long y, Long mod) {
    Long product = 1L;
    if (x - mod > 0) {
      for (Long i = x - mod; i <= x; i++) {
        product *= grid[i.intValue()][y.intValue()];
      }
    }
    return product;
  }

  private Long vertical(Long x, Long y, Long mod) {
    Long product = 1L;
    if (y - mod > 0) {
      for (Long i = y - mod; i <= y; i++) {
        product *= grid[x.intValue()][i.intValue()];
      }
    }
    return product;
  }

  private Long diagonal(Long x, Long y, Long mod) {
    Long leftProduct = 1L;
    Long rightProduct = 1L;
    if (x - mod > 0 && y - mod > 0) {
      for (Long i = mod; i >= 0; i--) {
        leftProduct *= grid[((Long)(x-i)).intValue()][((Long)(y-i)).intValue()];
      }
    }
    if (x + mod < grid.length - 1 && y - mod > 0) {
      for (Long i = mod; i >= 0; i--) {
        rightProduct *= grid[((Long)(x+i)).intValue()][((Long)(y-i)).intValue()];
      }
    }
    if (leftProduct > rightProduct) {
      return leftProduct;
    }
    return rightProduct;
  }

  public void setGrid(Integer[][] grid) {
    this.grid = grid;
  }
}
