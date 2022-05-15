import java.util.Scanner;
import src.Div;
import src.Mul;
import src.Sub;
import src.Sum;

public class App {

  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[2]);

    char operator = args[1].charAt(0);

    switch (operator) {
      case '+':
        Sum sum = new Sum();
        System.out.printf("\n" + sum.calculate(a, b));
        break;
      case '-':
        Sub sub = new Sub();
        System.out.printf("\n" + sub.calculate(a, b));
        break;
      case '/':
        if (a < b) {
          System.out.printf("Erro");
          break;
        }
        Div div = new Div();
        System.out.printf("\n" + div.calculate(a, b));
        break;
      case '*':
        Mul mul = new Mul();
        System.out.printf("\n" + mul.calculate(a, b));
      default:
        throw new IllegalArgumentException();
    }
  }
}
