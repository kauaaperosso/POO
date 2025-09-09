import java.io.IOException;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        int tamanho = senha.length();

        boolean V1 = false;
        boolean V2 = false;
        boolean V3 = false;
        boolean V4 = false;
        boolean V5 = false;

        if (tamanho >= 8) {
            V1 = true;
        }

        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                V2 = true;
            } else if (Character.isLowerCase(c)) {
                V3 = true;
            } else if (Character.isDigit(c)) {
                V4 = true;
            } else {
                V5 = true;
            }
        }

        if (V1 && V2 && V3 && V4 && V5) {
            System.out.println("É SEGURA!");
        } else {
            System.out.println("NÃO É SEGURA!");
    }
}

}