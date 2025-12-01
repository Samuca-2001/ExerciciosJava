import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);

    int n = ler.nextInt();
    double media_ponderada;
    double valor_1 = 0, valor_2 = 0, valor_3 = 0;

    for(int i = 0; i < n; i++ ){
        for(int o = 0; o < 3; o++){
            double x = ler.nextDouble();
            if (o == 0) {
                valor_1 = x*2;
            } else if (o == 1) {
                valor_2 = x*3;
            } else if (o == 2) {
                valor_3 = x*5;
            } 
            }
            media_ponderada = (valor_1 + valor_2 + valor_3)/10;
            System.out.printf("%.1f%n", media_ponderada);
        }
        ler.close();
    }
    }
