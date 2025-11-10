package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a;

        System.out.println("Digite um número: ");
        a = ler.nextInt();
        
        if (a < 0) {
            System.out.println("Esse número é negativo.");
        } else {
            System.out.println("Esse número é positivo.");
        }

        ler.close();
        
    }
}
