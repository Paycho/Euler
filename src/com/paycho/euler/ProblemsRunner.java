
package com.paycho.euler;

import com.google.common.base.Stopwatch;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.ProblemWithTest;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class ProblemsRunner {
  
  Map<String, Provider<Problem>> problems;
  
  @Inject
  public ProblemsRunner(Map<String, Provider<Problem>> problems) {
    this.problems = problems;
  }
  
  public void runProblems() {
    for (Entry<String, Provider<Problem>> entry : problems.entrySet()) {
      Problem problem = entry.getValue().get();
      StringBuilder builder = new StringBuilder();
      builder.append(problem.getClass().getSimpleName()).append(" : ");
      if (problem instanceof ProblemWithTest) {
        try {
          ((ProblemWithTest) problem).Test();
        } catch (AssertionError e) {
          builder.append("Failed its test, skipping...");
          System.out.println(builder.toString());
          continue;
        }
      }
      Stopwatch watch = Stopwatch.createStarted();
      builder.append(problem.solve());
      builder.append(" , in ").append(watch.stop());
      System.out.println(builder.toString());
    }
  }
}
