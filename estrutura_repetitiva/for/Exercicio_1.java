import java.util.Scanner;

public class Exercicio_1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        if (x >= 1 && x <= 1000 ) {
            for(int i = 0; i < x; i++){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        } else{
            System.out.println("Número fora do intervalo!");
        }
        ler.close();
    }
}