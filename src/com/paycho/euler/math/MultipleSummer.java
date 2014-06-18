package com.paycho.euler.math;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Sums multiples under the number that this class was constructed with.
 * 
 * @author Paycho
 */
public class MultipleSummer {
  
  private Integer sumUnder;
  
  public Integer getSum(Set<Integer> factors) {
    Set<Integer> multiples = Sets.newHashSet();
    for (int i = sumUnder - 1; i > 0; i--) {
      for (Integer factor : factors) {
        if (i % factor == 0) {
          multiples.add(i);
        }
      }
    }
    
    Integer sum = 0;
    for (Integer multiple : multiples) {
      sum += multiple;
    }
    return sum;
  }

  public void setMultipleNumber(Integer sumUnder) {
    this.sumUnder = sumUnder;
  }
}
