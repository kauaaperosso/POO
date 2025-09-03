import java.io.IOException;

public class Exercicio11 {

    public static void main(String[] args) throws IOException {

        int x = 0; 
        int numero = 2; 

        System.out.println("Os 15 primeiros números primos são:");
        

        while (x < 15) {

            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break; 
                }
            }

            if (primo) {
                System.out.print(numero + " ");
                x++; 
            }
            
            numero++; 
        }
    }
}