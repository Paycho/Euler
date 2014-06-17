package com.paycho.euler;

import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableSet;
import com.paycho.euler.problems.*;

public class EulerMain {
  
  public static final ImmutableSet<Problem> problems = ImmutableSet.<Problem>builder()
      .add(new Problem1())
      .add(new Problem2())
      .add(new Problem3())
      .add(new Problem4())
      .add(new Problem5())
      .build();

  public static void main(String[] args) {
    problems.stream().forEach((problem) -> {
      StringBuilder builder = new StringBuilder();
      builder.append(problem.getClass().getSimpleName()).append(" : ");
      Stopwatch watch = Stopwatch.createStarted();
      builder.append(problem.solve());
      builder.append(" , in ").append(watch.stop());
      System.out.println(builder.toString());
    });
  }
    
}
