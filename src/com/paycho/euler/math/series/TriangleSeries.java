package com.paycho.euler.math.series;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import java.util.ArrayList;

/**
 * Created by Paycho on 6/24/2014.
 */
public class TriangleSeries {

  // Super cheaty to initialize this way
  private final ArrayList<Long> triangleNumbers = Lists.newArrayListWithExpectedSize(510*510);

  public Long getTriangleNumber(Long nth) {
    if (nth < triangleNumbers.size()) {
      return triangleNumbers.get(nth.intValue() - 1);
    }

    long number = triangleNumbers.size() > 0 ? triangleNumbers.get(triangleNumbers.size() - 1) : 0L;
    long position = triangleNumbers.size() > 0 ? triangleNumbers.size() : 0L;

    while (position <= nth) {
      number += position++;
      triangleNumbers.add(number);
    }
    return number;
  }
}
