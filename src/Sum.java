package src;

import src.Calculator;

public class Sum implements Calculator {

  @Override
  public double calculate(double a, double b) {
    return a + b;
  }
}
