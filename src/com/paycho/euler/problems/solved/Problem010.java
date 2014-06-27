
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.SieveOfEratosthenes;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.problems.ProblemWithTest;
import com.paycho.euler.utils.annotations.JoeDrago;

import static org.junit.Assert.assertEquals;

/**
 * Project euler - Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 *
 * lelplayz
 */
public class Problem010 implements ProblemWithTest<Long> {
  
  private final SieveOfEratosthenes sieve;
  
  @Inject
  public Problem010(SieveOfEratosthenes sieve) {
    this.sieve = sieve;
  }

  @Override
  public void test() {
    assertEquals((Long) 17L, sieve.sumPrimesBelow(10L));
  }
  
                    @JoeDrago  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago
                    @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago@JoeDrago@JoeDrago
                    @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago
                    @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago
                    @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago@JoeDrago@JoeDrago
                    @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago@JoeDrago@JoeDrago
  @JoeDrago         @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago
  @JoeDrago         @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago
  @JoeDrago         @JoeDrago  @JoeDrago         @JoeDrago  @JoeDrago@JoeDrago@JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago

  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago       @JoeDrago      @JoeDrago@JoeDrago@JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago       @JoeDrago      @JoeDrago@JoeDrago@JoeDrago
           @JoeDrago           @JoeDrago@JoeDrago       @JoeDrago               @JoeDrago
           @JoeDrago           @JoeDrago    @JoeDrago   @JoeDrago               @JoeDrago
           @JoeDrago           @JoeDrago    @JoeDrago   @JoeDrago               @JoeDrago
           @JoeDrago           @JoeDrago       @JoeDrago@JoeDrago   @JoeDrago   @JoeDrago
           @JoeDrago           @JoeDrago       @JoeDrago@JoeDrago   @JoeDrago   @JoeDrago
           @JoeDrago           @JoeDrago       @JoeDrago@JoeDrago   @JoeDrago   @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago       @JoeDrago@JoeDrago   @JoeDrago   @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago       @JoeDrago@JoeDrago      @JoeDrago@JoeDrago
                    
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago
  @JoeDrago                    @JoeDrago                             @JoeDrago
  @JoeDrago                    @JoeDrago                             @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago                             @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago                             @JoeDrago
  @JoeDrago                    @JoeDrago                             @JoeDrago
  @JoeDrago                    @JoeDrago                             @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago           @JoeDrago
  @JoeDrago@JoeDrago@JoeDrago  @JoeDrago@JoeDrago@JoeDrago           @JoeDrago
  @Override
  public Long solve() {
    return sieve.sumPrimesBelow(2000000L);
  }
}
