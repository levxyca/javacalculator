package src;

import src.Calculator;

public class Sub implements Calculator {

    @Override
    public double calculate(double a, double b) {
      return a - b;
    }
}
