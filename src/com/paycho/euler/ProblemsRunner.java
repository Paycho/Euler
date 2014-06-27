
package com.paycho.euler;

import com.google.common.base.Stopwatch;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.paycho.euler.problems.ProblemWithTest;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class ProblemsRunner {
  
  Map<String, Provider<ProblemWithTest>> problems;
  
  @Inject
  public ProblemsRunner(Map<String, Provider<ProblemWithTest>> problems) {
    this.problems = problems;
  }
  
  public void runProblems() {
    for (Entry<String, Provider<ProblemWithTest>> entry : problems.entrySet()) {
      ProblemWithTest problem = entry.getValue().get();
      StringBuilder builder = new StringBuilder();
      builder.append(problem.getClass().getSimpleName()).append(" : ");
      try {
        problem.test();
      } catch (AssertionError e) {
        builder.append(String.format("Failed its test with error %s.", e.getMessage()));
        System.out.println(builder.toString());
        continue;
      }
      if (!ProblemsModule.Arguments.runTests) {
        Stopwatch watch = Stopwatch.createStarted();
        builder.append(problem.solve());
        builder.append(" , in ").append(watch.stop());
      } else {
        builder.append("Test Successful!");
      }
      System.out.println(builder.toString());
    }
  }
}
