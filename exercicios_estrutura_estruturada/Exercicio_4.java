import java.util.Scanner;
import java.util.Locale;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_fun;
		double hora_trab, valor_hora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		num_fun = sc.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		hora_trab = sc.nextDouble();
		
		System.out.print("Digite o valor da hora trabalhada: ");
		valor_hora = sc.nextDouble();
		
		salario = hora_trab * valor_hora;
		
		System.out.println("Number = " + num_fun);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}

}
