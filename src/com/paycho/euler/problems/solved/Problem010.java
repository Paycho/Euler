
package com.paycho.euler.problems.solved;

import com.google.inject.Inject;
import com.paycho.euler.math.primes.SieveOfEratosthenes;
import com.paycho.euler.problems.Problem;
import com.paycho.euler.utils.annotations.JoeDrago;

/**
 * For obvious reasons this is the best class ever.
 * @author Paycho <paycho@paycho.org>
 */
public class Problem010 implements Problem<Long> {
  
  private final SieveOfEratosthenes sieve;
  
  @Inject
  public Problem010(SieveOfEratosthenes sieve) {
    this.sieve = sieve;
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
  public Long solve() {
    return sieve.sumPrimesBelow(2000000L);
  }
}
