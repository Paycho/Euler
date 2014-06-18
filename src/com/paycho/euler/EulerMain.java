package com.paycho.euler;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.paycho.euler.ProblemsModule.Arguments;
import com.sampullara.cli.Args;

public class EulerMain {

  public static void main(String[] args) {
    Args.parse(new Arguments(), args);
    Injector injector = Guice.createInjector(new ProblemsModule());
    injector.getInstance(ProblemsRunner.class).runProblems();
  }   
}
