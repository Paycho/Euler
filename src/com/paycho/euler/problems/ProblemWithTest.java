package com.paycho.euler.problems;

public interface ProblemWithTest<T> {

  public T solve();

  public void test() throws AssertionError;
}
