
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.Sieve;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.ProblemWithTest;

import static org.junit.Assert.assertEquals;

/**
 * Project Euler - Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem007 implements ProblemWithTest<Long> {
  
  private final Sieve sieve;
  
  @Inject
  public Problem007(Sieve sieve) {
    this.sieve = sieve;
  }

  @Override
  public void test() {
    assertEquals((Long) 13L, sieve.findNthPrime(6L));
    assertEquals((Long) 17L, sieve.findNthPrime(7L));
    assertEquals((Long) 19L, sieve.findNthPrime(8L));
  }

  @Override
  public Long solve() {
    return sieve.findNthPrime(10001L);
  }
}
