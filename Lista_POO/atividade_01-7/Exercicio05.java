import java.io.IOException;
import java.util.Scanner;

public class Exercicio05{

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        int tamanho = palavra.length();

        System.out.println("N° de Letras"+tamanho);
        
        int y = 0;

		for (int x = 0; x < tamanho; x++) {
            char letra = palavra.charAt(x);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
            || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                y ++;
            }
        }
        
        System.out.println("N° de Vogais " + y);
    }
	
	}

