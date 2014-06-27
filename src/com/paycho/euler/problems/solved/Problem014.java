package com.paycho.euler.problems.solved;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.paycho.euler.problems.ProblemWithTest;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Problem014 implements ProblemWithTest<String> {

  // Maps each Long key with the length of its collatz sequence
  long lengths[] = new long[1000000];

  Long longestSequence = 0L;
  Long startingNumber = 1L;

  @Inject
  public Problem014() {
    lengths[1] = 1L;
    lengths[2] = 2L;
  }

  public String solve() {
    for (long i = 3L; i < 1000000L; i++) {
      Long length = collatzMeBaby(i);
      if (length > longestSequence) {
        longestSequence = length;
        startingNumber = i;
      }
      lengths[(int)i] = length;
    }
    return "Sequence starting at: " + startingNumber + " has length: " + longestSequence;
  }

  public void Test() throws AssertionError {
    assertEquals(10L, collatzMeBaby(13L));
  }

  private long collatzMeBaby(Long input) {
    Long length = 0L;
    try {
      while (true) {
        if (input < lengths.length && lengths[input.intValue()] != 0) {
          return lengths[input.intValue()] + length;
        }
        length++;
        if (input % 2 == 0) {
          input /= 2;
        } else {
          input = input * 3 + 1;
        }
      }
    } catch (Exception e) {
      System.out.println("wat");
      return 0L;
    }
  }
}
