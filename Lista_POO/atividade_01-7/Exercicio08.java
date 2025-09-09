import java.io.IOException;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        
        String textoLimpo = palavra.toLowerCase().replace(" ", "");

        int tamanho = textoLimpo.length();

        boolean Palindromo = true;

        for (int i = 0; i < tamanho / 2; i++) {

            if (textoLimpo.charAt(i) != textoLimpo.charAt(tamanho - 1 - i)) {
                Palindromo = false; 
                break; 
            }
        }

        if (Palindromo) {
            System.out.println("'" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("'" + palavra + "' não é um palíndromo.");
        }
    }
}