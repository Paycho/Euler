package com.paycho.euler.utils;

import java.math.BigInteger;

public class MoreMath {

  public static BigInteger factorial(long n) {
    if (n == 1) {
      return BigInteger.ONE;
    } else {
      return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
  }
}
