package estrutura_sequencial;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite um número:");
		a = sc.nextInt();
		
		System.out.print("Digite um número:");
		b = sc.nextInt();
		
		System.out.print("Digite um número:");
		c = sc.nextInt();
		
		System.out.print("Digite um número:");
		d = sc.nextInt();
		
		diferenca = (a*b) - (c*d);
		
		System.out.print("Diferença = " + diferenca);
		
		sc.close();
	}

}
