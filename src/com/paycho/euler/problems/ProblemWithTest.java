package com.paycho.euler.problems;

public interface ProblemWithTest<T> extends Problem<T> {
  public void test() throws AssertionError;
}
