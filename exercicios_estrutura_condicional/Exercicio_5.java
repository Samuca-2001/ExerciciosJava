package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int codigo, quantidade;
        double preco = 0, total;

        System.out.println("Digite o código do item: ");
        codigo = ler.nextInt();

        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        
            default:
                System.out.println("Código inválido!");
                break;
        }

        System.out.println("Digite a quantidade do item: ");
        quantidade = ler.nextInt();

        total = preco * quantidade;

        System.out.println("Total: R$" + total);

        ler.close();
    }
}
