
package com.paycho.euler.math.multiplication;

import com.google.inject.Inject;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class LargestConsecutiveMultiple {
  
  public Integer largestConsecutiveMultiple(String number) {
    Integer runningTotal = 1;
    Integer currentLargest = 0;
    Deque<Integer> currentSet = new LinkedList();
    for (Character character : number.toCharArray()) {
      Integer current = Integer.valueOf(character.toString());
      runningTotal *= current;
      if (runningTotal == 0) {
        currentSet.clear();
        runningTotal = 1;
      } else {
        
        if (currentSet.size() == 5) {
          runningTotal /= currentSet.pop();
        }
        // 9*9*9*9*9 is the biggest possible value
        if (runningTotal > 59049) {
          throw new RuntimeException("You done fucked up, son");
        }
        currentSet.push(current);
        if (runningTotal > currentLargest) {
          currentLargest = runningTotal;
        }
      }
    }
    return currentLargest;
  }
}
