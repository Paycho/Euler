
package com.paycho.euler.math.primes;

import com.google.inject.Inject;
import java.math.BigInteger;
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
  
  public boolean isNonPrime(Long testNumber) {
    Integer magnitude = ((Double) Math.log10(testNumber)).intValue() + 1;
    BigInteger bigTestNumber = BigInteger.valueOf(testNumber);
    for (int i = 0; i < magnitude; i++) {
      BigInteger base = getFermatBase(bigTestNumber);
      if (!base.modPow(
          bigTestNumber.subtract(BigInteger.ONE), bigTestNumber).equals(BigInteger.ONE)) {
        return true;
      }
    }
    return false;
  }
  
  private BigInteger getFermatBase(BigInteger n) {
    while(true) {
      final BigInteger base = new BigInteger(n.bitLength(), random);
      if (BigInteger.ONE.compareTo(base) <= 0 && base.compareTo(n) < 0) {
        return base;
      }
    }
  }
}
