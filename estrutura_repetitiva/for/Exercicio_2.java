import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

    int n = ler.nextInt();
    int in = 0, out = 0;

    for(int i = 0; i < n; i++){
        int x = ler.nextInt();
        if(x >= 10 && x <= 20){
            in += 1;
        } else {
            out += 1;
        }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");
    
    ler.close();
    }
}

