import java.io.IOException;
import java.util.Scanner;

public class Exercicio06{

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numeroInverte = scanner.nextInt();
        int numeroInvertido = 0;

        while (numeroInverte > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numeroInverte % 10);
            numeroInverte = numeroInverte / 10;
		}
		System.out.println(numeroInvertido);
    }
	
	}

