import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int fatorial = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        ler.close();
    }
}
