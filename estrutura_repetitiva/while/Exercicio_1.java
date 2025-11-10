import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

    int senha;

    System.out.println("Digite a senha: ");
    senha = ler.nextInt();

    while (senha != 2002) {
        System.out.println("Senha inválida!");
        System.out.println("Digite a senha: ");
    senha = ler.nextInt();
    }

    System.out.println("Acesso Permitido");
    ler.close();
    }
}
