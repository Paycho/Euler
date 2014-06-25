
package com.paycho.euler.math.primes;

import java.math.BigInteger;
import java.util.Random;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(MockitoJUnitRunner.class)
public class FermatPrimeTesterTest {
  
  private Random random = new Random();
  
  private final Integer TOTAL_TESTS = 100;
  
  /**
   * Note: This test is INHERENTLY flaky. To run it, un-annotate the @Ignore.
   */
  @Test
  @Ignore
  public void testFermatWitness() {
    FermatPrimeTester tester = new FermatPrimeTester(random);
    int agreements = 0;
    for (int i = 0; i < TOTAL_TESTS; i++) {
      Long testLong = random.nextLong();
      if (testLong < 0) {
        testLong *= -1;
      }
      if(BigInteger.valueOf(testLong).isProbablePrime(90) == !tester.isNonPrime(testLong)) {
        agreements++;
      }
    }
    if (agreements < TOTAL_TESTS/2) {
      throw new RuntimeException("Total agreements less than expected, got " + agreements);
    }
  }
}
