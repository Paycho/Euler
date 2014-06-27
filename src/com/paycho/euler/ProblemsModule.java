
package com.paycho.euler;

import com.google.common.collect.ImmutableMap;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.paycho.euler.math.primes.Sieve;
import com.paycho.euler.math.primes.SieveOfEratosthenes;
import com.paycho.euler.problems.*;
import com.paycho.euler.problems.solved.*;
import com.sampullara.cli.Argument;
import java.util.Map.Entry;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class ProblemsModule extends AbstractModule {
  
  private static final String ALL_PROBLEMS = "all";
  
  public static class Arguments {
    @Argument(value = "problems", 
        description = "which problem numbers to run, '" + ALL_PROBLEMS + "' for every problem", 
        delimiter = ",") 
    public static String[] problemNumbers = {ALL_PROBLEMS};

    @Argument(value = "test",
        description = "only run the tests for each problem")
    public static Boolean runTests = false;
  }
  
  private static final ImmutableMap<String, Class<? extends ProblemWithTest>> problems =
      ImmutableMap.<String, Class<? extends ProblemWithTest>>builder()
          .put("1", Problem001.class)
          .put("2", Problem002.class)
          .put("3", Problem003.class)
          .put("4", Problem004.class)
          .put("5", Problem005.class)
          .put("6", Problem006.class)
          .put("7", Problem007.class)
          .put("8", Problem008.class)
          .put("9", Problem009.class)
          .put("10", Problem010.class)
          .put("11", Problem011.class)
          .put("12", Problem012.class)
          .put("13", Problem013.class)
          .put("14", Problem014.class)
          .build();
  
  @Override
  public void configure() {
    MapBinder<String, ProblemWithTest> mapBinder =
        MapBinder.newMapBinder(binder(), String.class, ProblemWithTest.class);
    if (Arguments.problemNumbers[0].equals(ALL_PROBLEMS)) {
      for (Entry<String, Class<? extends ProblemWithTest>> entry : problems.entrySet()) {
        mapBinder.addBinding(entry.getKey()).to(entry.getValue());
      }
    } else {
      for (String problemNumber : Arguments.problemNumbers) {
        if (problems.containsKey(problemNumber)) {
          mapBinder.addBinding(problemNumber).to(problems.get(problemNumber));
        }
      }
    }
    
    bind(Sieve.class).to(SieveOfEratosthenes.class);
  }
}
