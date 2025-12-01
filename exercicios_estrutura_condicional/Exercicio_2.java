package exercicios_estrutura_condicional;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;

        System.out.println("Digite um número: ");
        a = ler.nextInt();

        if (a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        ler.close();
    }
}
