package com.paycho.euler.math;

import com.google.common.collect.ImmutableSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@RunWith(JUnit4.class)
public class MultipleSummerTest {
  
  @Test
  public void verifySum() throws Exception {
    MultipleSummer summer = new MultipleSummer();
    summer.setMultipleNumber(10);
    assertEquals((Integer) 23, summer.getSum(ImmutableSet.<Integer>of(3, 5)));
  }
}
