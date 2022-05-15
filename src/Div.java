package src;

import src.Calculator;

public class Div implements Calculator {

  @Override
  public double calculate(double a, double b) {
    if (b == 0) return 0;

    return a / b;
  }
}
