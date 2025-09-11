public class Jogador{
    String nome;
    String posicao;
    Data dataNascimento;
    String nacionalidade;
    double altura;
    double peso;

    int idadeJogador(int diaAtual, int mesAtual, int anoAtual) {
        return dataNascimento.intervaloAnos(diaAtual, mesAtual, anoAtual);
    }
    
    void mostrarInformacoes(int diaAtual, int mesAtual, int anoAtual) {
        System.out.println("\n--- Dados do Jogador ---");
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Idade: " + idadeJogador(diaAtual, mesAtual, anoAtual) + " anos");
    }
}