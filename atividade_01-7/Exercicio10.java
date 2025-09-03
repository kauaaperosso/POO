import java.io.IOException;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        System.out.println(n);
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        for (int x : notas) {
            int qtd = n / x;
            System.out.println(qtd + " nota(s) de R$ " + x + ",00");
            n = n % x;
        }
    }

}
