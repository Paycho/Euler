
package com.paycho.euler.math.primes;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.paycho.euler.math.primes.Factorizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class FactorizerTest {

  @Test
  public void testFactorizer() throws Exception {
    Factorizer factorizer = new Factorizer();
    Multiset<Integer> expected = HashMultiset.create();
    expected.add(2);
    expected.add(2);
    expected.add(5);
    Multiset<Integer> factors = factorizer.factor(20);
    assertEquals(expected, factors);
    
    expected = HashMultiset.create();
    expected.add(7);
    factors = factorizer.factor(7);
    assertEquals(expected, factors);
  }
}
