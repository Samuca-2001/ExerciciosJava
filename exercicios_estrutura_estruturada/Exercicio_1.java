import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		b = sc.nextInt();												
		
		soma = a + b;
		
		System.out.println("O resultado da soma de " + a + " + " + b + " é " + soma + ".");
		
		sc.close();
	}

}
