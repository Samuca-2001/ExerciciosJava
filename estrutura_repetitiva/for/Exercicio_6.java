import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int valor = 0;

        for(int i = 1; i <= n; i++){
            valor = n % i;
            if (valor == 0) {
                System.out.println(i);
            } 
        }

        ler.close();
    }
}
