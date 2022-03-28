import java.util.Scanner;

public class calculator {
    static public void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            operations op = new operations();

            number n1 = new number();
            number n2 = new number();
            number res = new number();
            number option = new number();

            String menu = "Calculadora\n\n" +
                    "1-Somar\n" +
                    "2-Subtrair\n" +
                    "3-Multiplicar\n" +
                    "4-Dividir\n\n";

            String operation = "";

            String proceed = "Y";

            while (proceed.equals("Y") || proceed.equals("y")) {
                System.out.printf(menu);
                System.out.printf("Qual operação deseja executar? Digite o número referente a opção: ");
                option.setValue(scan.nextInt());

                System.out.printf("Digite o 1º valor: ");
                n1.setValue(scan.nextInt());

                System.out.printf("Digite o 2º valor: ");
                n2.setValue(scan.nextInt());

                switch (option.getValue()) {
                    case 1:
                        res.setValue(op.sum(n1.getValue(), n2.getValue()));
                        operation = "soma";
                        break;
                    case 2:
                        res.setValue(op.sub(n1.getValue(), n2.getValue()));
                        operation = "subtração";
                        break;
                    case 3:
                        res.setValue(op.mul(n1.getValue(), n2.getValue()));
                        operation = "multiplicação";
                        break;
                    case 4:
                        res.setValue(op.div(n1.getValue(), n2.getValue()));
                        operation = "divisão";
                        break;
                    default:
                        break;
                }

                System.out.printf("\nA %s de %d com %d é: %d", operation, n1.getValue(), n2.getValue(), res.getValue());

                System.out.printf("\nDeseja realizar outra operação? Y(es)/N(o)\n");
                proceed = scan.next();

                System.out.printf("\n");
            }
        }
    }
}