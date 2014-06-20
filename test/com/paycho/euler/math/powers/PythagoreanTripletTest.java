
package com.paycho.euler.math.powers;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class PythagoreanTripletTest {
  
  @Test
  public void testKnownTriplet() {
    PythagoreanTriplet finder = new PythagoreanTriplet();
    Set<Long> answer = finder.findTriplet(12L);
    assertEquals(ImmutableSet.of(3L, 4L, 5L), answer);
  }
}
