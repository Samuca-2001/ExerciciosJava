import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + (i*i) + " "+ (i*i*i));
        }

        ler.close();
    }
}
