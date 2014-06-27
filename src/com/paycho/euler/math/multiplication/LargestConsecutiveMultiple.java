
package com.paycho.euler.math.multiplication;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class LargestConsecutiveMultiple {
  
  public Long largestConsecutiveMultiple(String number, Integer size) {
    Deque<Integer> currentSet = new LinkedList();
    Long largest = 0L;
    for (Character character : number.toCharArray()) {
      Integer current = Integer.valueOf(character.toString());
      currentSet.push(current);
      if (currentSet.size() == size) {
        Long total = 1L;
        for (Integer entry : currentSet.toArray(new Integer[0])) {
          total *= entry;
        }
        if (total > largest) {
          largest = total;
        }
        currentSet.removeLast();
      }
    }
    return largest;
  }
}
