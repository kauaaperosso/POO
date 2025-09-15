import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Aluno ---");
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da Prova 1: ");
        double notaP1 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double notaP2 = scanner.nextDouble();

        System.out.print("Digite a nota do Trabalho: ");
        double notaT = scanner.nextDouble();
        
        Aluno aluno = new Aluno(matricula, nome, notaP1, notaP2, notaT);

        double mediaFinal = CalculadoraAcademica.calculaMedia(aluno);
        double notaFinalNecessaria = CalculadoraAcademica.calculaNotaParaFinal(aluno);

        System.out.println("\n--- Resultados ---");
        System.out.printf("Nome: %s\n", aluno.getNome());
        System.out.printf("Média Final: %.2f\n", mediaFinal);
        
        if (notaFinalNecessaria == 0.0) {
            if (mediaFinal >= 7.0) {
                System.out.println("Status: Aprovado! Não precisa de prova final.");
            } else {
                System.out.println("Status: Reprovado. Não tem mais chance na prova final.");
            }
        } else {
            System.out.printf("Status: Precisa de %.2f na prova final para ser aprovado.\n", notaFinalNecessaria);
        }

        scanner.close();
    }
}