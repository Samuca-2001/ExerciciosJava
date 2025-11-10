import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

        System.out.println("Digite um valor: ");
        A = ler.nextDouble();

        System.out.println("Digite outro valor: ");
        B = ler.nextDouble();

        System.out.println("Digite outro valor: ");
        C = ler.nextDouble();

        triangulo = (A * C)/2;
        circulo = pi * (C*C);
        trapezio = ((A+B)*C)/2;
        quadrado = B*B;
        retangulo = A * C;

        System.out.printf("TRIÂNGULO: %.2f%n", triangulo);
        System.out.printf("CÍRCULO: %.2f%n", circulo);
        System.out.printf("TRAPÉZIO: %.2f%n", trapezio);
        System.out.printf("QUADRADO: %.2f%n", quadrado);
        System.out.printf("RETÂNGULO: %.2f%n", retangulo);


        ler.close();
        
    }
}
