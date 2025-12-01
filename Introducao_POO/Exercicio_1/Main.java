package Exercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = ler.nextDouble();
        rectangle.height = ler.nextDouble();
        
        System.out.printf(rectangle.toString());

        ler.close();
    }
}