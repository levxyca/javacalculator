import java.util.Scanner;

public class calculator {
    static public void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            operations op = new operations();

            number n1 = new number();
            number n2 = new number();
            number res = new number();
            number option = new number();

            String menu = "\n\nCalculadora\n\n" +
                    "1-Somar\n" +
                    "2-Subtrair\n" +
                    "3-Multiplicar\n" +
                    "4-Dividir\n\n";

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
                        break;
                    case 2:
                        res.setValue(op.sub(n1.getValue(), n2.getValue()));
                        break;
                    case 3:
                        res.setValue(op.mul(n1.getValue(), n2.getValue()));
                        break;
                    case 4:
                        res.setValue(op.div(n1.getValue(), n2.getValue()));
                        break;
                    default:
                        break;
                }

                System.out.printf("\n%d\n", res.getValue());

                System.out.printf("\nDeseja realizar outra operação? Y(es)/N(o)\n");
                proceed = scan.next();
            }
        }
    }
}