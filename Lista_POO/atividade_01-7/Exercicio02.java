import java.io.IOException;
import java.util.Scanner;

public class Exercicio02{
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a um valor: ");
        int N = scanner.nextInt();
        
        int a = 0;
        int b = 1;

        if (N <= 0) {
            System.out.println("Por favor, digite um número inteiro maior que 0.");
            scanner.close();
            return;
        }

        System.out.println("Os " + N + " primeiros números da sequência de Fibonacci são:");

        for (int i = 0; i < N; i++) {
            
            System.out.print(a + " ");
            
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
