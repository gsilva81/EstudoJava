package Challenges;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu primeiro salário");
        var s1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu segundo salário");
        var s2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu terceiro salário");
        var s3 = entrada.nextLine().replace(",", ".");

        Double a = Double.parseDouble(s1);
        Double b = Double.parseDouble(s2);
        Double c = Double.parseDouble(s3);
        double media = (a + b + c) / 3;
        System.out.println("A média é igual a " + media);

        entrada.close();
    }
}
