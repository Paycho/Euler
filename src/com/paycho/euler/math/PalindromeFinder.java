
package com.paycho.euler.math;

import com.google.inject.Inject;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class PalindromeFinder {
  private Integer digits;
  
  private Integer maximum = 1;
  private Integer minimum = 1;
  
  @Inject
  public PalindromeFinder() {
  }
  
  
  
  public Integer findBiggestPalindrome(Integer digits) {
    this.digits = digits;
    calculateBounds();
    
    for (int i = maximum; i > minimum; i--) {
      for (int j = maximum; j > minimum; j--) {
        Integer possiblePalindrome = i*j;
        if(check(possiblePalindrome.toString())) {
          return possiblePalindrome;
        }
      }
    }
    return -1;
  }
  
  private boolean check(String possiblePalindrome) {
    for (int i = 0; i < possiblePalindrome.length()/2; i++) {
      if(possiblePalindrome.charAt(i) != 
          possiblePalindrome.charAt(possiblePalindrome.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  
  private void calculateBounds() {
    maximum = 1;
    minimum = 1;
    
    for (int i = 1; i < digits; i++) {
      maximum *= 10;
      minimum *= 10;
    }
    maximum *= 10;
    maximum -= 1;
  }
}
