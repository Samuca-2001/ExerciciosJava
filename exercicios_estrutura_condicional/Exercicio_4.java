package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int hora_i, hora_f, duracao;

        System.out.println("Digite quando começou o jogo: ");
        hora_i = ler.nextInt();

        System.out.println("Digite quando começou o jogo: ");
        hora_f = ler.nextInt();

        if (hora_i >= hora_f){
            duracao = (24 - hora_i) + hora_f;
        } else {
            duracao = hora_f - hora_i;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        ler.close();
    }
}
