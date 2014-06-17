
package com.paycho.euler.math.series;

import com.google.common.collect.Lists;
import java.util.List;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class FibonacciSummer {
  private final List<Integer> fibonacciNumbers = Lists.newArrayList();
  
  private final Integer maximumFibonacci;
  
  public FibonacciSummer(Integer maximumFibonacci) {
    this.maximumFibonacci = maximumFibonacci;
    fibonacciNumbers.add(1);
    fibonacciNumbers.add(2);
  }
  
  public Integer findSum() {
    Integer sum = 0;
    Integer n = 2;
    while (fibonacciNumbers.get(fibonacciNumbers.size() - 1) < maximumFibonacci) {
      sum += fibonacciNumbers.get(fibonacciNumbers.size() - 1) % 2 == 0 ? 
          fibonacciNumbers.get(fibonacciNumbers.size() - 1) : 0;
      fibonacciNumbers.add(fibonacciNumbers.get(n-1) + fibonacciNumbers.get(n-2));
      ++n;
    }
    
    return sum;
  }
  
}
