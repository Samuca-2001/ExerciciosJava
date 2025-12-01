import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int menu, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Escolha uma opção: 1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim: ");
        menu = ler.nextInt();

        while (menu != 4) {
            if (menu == 1) {
                alcool += 1;
            } else if (menu == 2) {
                gasolina += 1;
            } else if (menu == 3) {
                diesel += 1;
            } 
            System.out.println("Escolha uma opção: 1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim: ");
            menu = ler.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        ler.close();

    }
}
