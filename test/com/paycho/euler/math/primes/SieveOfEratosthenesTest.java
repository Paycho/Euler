
package com.paycho.euler.math.primes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(MockitoJUnitRunner.class)
public class SieveOfEratosthenesTest {
  
  @Test
  public void testSieve() throws Exception {
    SieveOfEratosthenes sieve = new SieveOfEratosthenes();
    assertEquals((Long) 13L, sieve.findNthPrime(6L));
    assertEquals((Long) 17L, sieve.findNthPrime(7L));
    assertEquals((Long) 19L, sieve.findNthPrime(8L));
  }
}
