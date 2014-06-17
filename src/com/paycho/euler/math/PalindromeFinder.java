
package com.paycho.euler.math;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class PalindromeFinder {
  private final Integer digits;
  
  private Integer maximum = 1;
  private Integer minimum = 1;
  
  public PalindromeFinder(Integer digits) {
    this.digits = digits;
    calculateBounds();
  }
  
  
  
  public Integer findBiggestPalindrome() {
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
    for (int i = 1; i < digits; i++) {
      maximum *= 10;
      minimum *= 10;
    }
    maximum *= 10;
    maximum -= 1;
  }
}
