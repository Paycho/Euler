
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
    Multiset<Long> expected = HashMultiset.create();
    expected.add(2L);
    expected.add(2L);
    expected.add(5L);
    Multiset<Long> factors = factorizer.factor(20L);
    assertEquals(expected, factors);
    
    expected = HashMultiset.create();
    expected.add(7L);
    factors = factorizer.factor(7L);
    assertEquals(expected, factors);

    expected = HashMultiset.create();
    expected.add(2L, 3);
    factors = factorizer.factor(8L);
    assertEquals(expected, factors);
  }
}
