import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double dollar, dollar_purchased, result;

        System.out.println("What is the dollar price? ");
        dollar = ler.nextDouble();
         System.out.println("How many dollars will be bought? ");
        dollar_purchased = ler.nextDouble();

        result = CurrencyConverter.convert(dollar, dollar_purchased);
        System.out.println(result);

        ler.close();
    }
}
