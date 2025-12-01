import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        double divisao = 0;
        double numerador = 0, denominador = 0;

        for(int i = 0; i < n; i++){
            numerador = ler.nextInt();
            denominador = ler.nextInt();
            
            if (denominador != 0) {    
                divisao = numerador/denominador;
                System.out.printf("%.1f%n", divisao);
            } else {
                System.out.println("Divisão impossível");
            }
        }
        ler.close();
    }
}
