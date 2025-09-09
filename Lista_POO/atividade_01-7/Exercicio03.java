import java.io.IOException;
import java.util.Arrays;

public class Exercicio03{
 
    public static void main(String[] args) throws IOException {

        double[] numeros = {10.5, 20.0, 15.2, 5.8, 30.1, 25.5};

        double media = calcularMedia(numeros);
        System.out.println("A média dos valores é: " + media);

        double mediana = calcularMediana(numeros);
        System.out.println("A mediana dos valores é: " + mediana);
    }
    
    public static double calcularMedia(double[] vetor) {
        double soma = 0;

        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
    
    public static double calcularMediana(double[] vetor) {
        

        Arrays.sort(vetor);
        
        int tamanho = vetor.length;
        
        if (tamanho % 2 == 0) {
            int indice1 = tamanho / 2 - 1;
            int indice2 = tamanho / 2;
            return (vetor[indice1] + vetor[indice2]) / 2.0;
        } else {
            return vetor[tamanho / 2];
        }
    }
}
