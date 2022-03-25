import java.util.Scanner;

public class calculator {
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        number n1 = new number();
        number n2 = new number();
        number res = new number();

        String options = "Y";

        while (options.equals("Y") || options.equals("y")) {
            System.out.printf("Digite o 1º valor: ");
            n1.setValue(scan.nextInt());

            System.out.printf("Digite o 2º valor: ");
            n2.setValue(scan.nextInt());

            res.setValue(n1.getValue() + n2.getValue());

            System.out.printf("\nA soma de %d com %d é: %d", n1.getValue(), n2.getValue(), res.getValue());

            System.out.printf("\nDeseja somar outro valor? Y(es)/N(o)\n");
            options = scan.next();

            System.out.printf("\n");
        }
    }
}