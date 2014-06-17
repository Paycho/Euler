package com.paycho.euler;

import com.google.common.collect.ImmutableSet;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.Problem1;
import com.paycho.euler.problems.Problem2;
import com.paycho.euler.problems.Problem3;
import com.paycho.euler.problems.Problem4;

public class EulerMain {
  
  public static final ImmutableSet<Problem> problems = ImmutableSet.<Problem>builder()
      .add(new Problem1())
      .add(new Problem2())
      .add(new Problem3())
      .add(new Problem4())
      .build();

  public static void main(String[] args) {
    problems.stream().forEach((problem) -> {
      System.out.println(problem.getClass().getSimpleName() + " : " + problem.solve());
    });
  }
    
}
