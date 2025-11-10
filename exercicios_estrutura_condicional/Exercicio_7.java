package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double x, y;

        System.out.println("Digite um número: ");
        x = ler.nextDouble();

        System.out.println("Digite outro número: ");
        y = ler.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0){
            System.out.println("Eixo X");
        } else if (y == 0){
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        }

        ler.close();
    }
}