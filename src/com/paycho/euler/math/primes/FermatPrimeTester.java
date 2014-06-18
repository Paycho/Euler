
package com.paycho.euler.math.primes;

import com.google.inject.Inject;
import java.util.Random;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
public class FermatPrimeTester {
  private final Random random;
  
  @Inject
  public FermatPrimeTester(Random random) {
    this.random = random;
  }
  
  public boolean isNonPrime(Integer testNumber) {
    Integer magnitude = ((Double) Math.log10(testNumber)).intValue();
    for (int i = 0; i < magnitude; i++) {
      if (((Double) Math.pow(random.nextInt(testNumber), testNumber-1)).intValue() %
          testNumber != 1) {
        return true;
      }
    }
    return false;
  }
}
