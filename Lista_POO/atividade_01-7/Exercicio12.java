import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        
        int palpite;
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            
            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é MENOR. Tente novamente.");
            }
            
        } while (palpite != numeroSorteado); 
        
        System.out.println("Parabéns! Você acertou! O número era " + numeroSorteado + ".");
        
    }
}