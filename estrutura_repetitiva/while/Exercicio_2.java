import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, y;

        x = ler.nextInt();
        y = ler.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
             
            x = ler.nextInt();
            y = ler.nextInt();
        }

        ler.close();
    }
}
