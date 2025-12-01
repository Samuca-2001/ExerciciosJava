package estrutura_sequencial;
import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int cod_1, num_1, cod_2, num_2;
    double valor_1, valor_2, total;

    System.out.println("Digite o código da primeira peça: ");
    cod_1 = ler.nextInt();

    System.out.println("Digite a quantidade de peças que deseja: ");
    num_1 = ler.nextInt();

    System.out.println("Digite o valor da primeira peça: ");
    valor_1 = ler.nextDouble();

    System.out.println("Digite o código da segunda peça: ");
    cod_2 = ler.nextInt();

    System.out.println("Digite a quantidade de peças que deseja: ");
    num_2 = ler.nextInt();

    System.out.println("Digite o valor da segunda peça: ");
    valor_2 = ler.nextDouble();

    total = (num_1 * valor_1) + (num_2 * valor_2);

    System.out.println("Valor total a pagar: " + total);

    ler.close();

    }
}
