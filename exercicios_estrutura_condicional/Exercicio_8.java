package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double renda, imposto;

        System.out.println("Digite sua renda: ");
        renda = ler.nextDouble();

        if (renda <= 2000.00 && renda >= 0) {
            System.out.println("Isento");
            imposto = 0.0;
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
        } else if (renda <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((renda - 3000.00) * 0.18);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((renda - 4500.00) * 0.28);
        }

        System.out.printf("Total: R$ %.2f%n", imposto);

        ler.close();
    }
}
