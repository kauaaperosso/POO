public class Jogador{
    String nome;
    String posicao;
    Data dataNascimento;
    String nacionalidade;
    double altura;
    double peso;

    int idadeJogador(){
        return dataNascimento.intervaloAnos(8,9,2025);
    }
    
}