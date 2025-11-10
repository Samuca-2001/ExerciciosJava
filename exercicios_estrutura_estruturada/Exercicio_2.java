import java.util.Scanner;
import java.util.Locale;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159, raio;
		
		System.out.print("Escreve o valor do raio do círculo:");
		raio = sc.nextDouble();
		
		double area = pi * (raio * raio);
		
		System.out.printf("A área do círculo é %.4f%n", area);
								
		sc.close();
	}

}
