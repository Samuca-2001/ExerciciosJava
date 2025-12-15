import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Estudante estudante = new Estudante();

        estudante.nome = ler.nextLine();
        estudante.nota1 = ler.nextDouble();
        estudante.nota2 = ler.nextDouble();
        estudante.nota3 = ler.nextDouble();

        estudante.calcularNota();
        estudante.avaliacao();

        ler.close();
    }
}
