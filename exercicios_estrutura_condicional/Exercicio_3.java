package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);

    int a, b;

    System.out.println("Digite um número: ");
    a = ler.nextInt();

    System.out.println("Digite outro número: ");
    b = ler.nextInt();

    if (a % b == 0 || b % a == 0){
        System.out.println("São multíplos.");
    } else {
        System.out.println("Não são multiplos.");
    }
}
}

