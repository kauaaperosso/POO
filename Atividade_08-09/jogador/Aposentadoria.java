public class Aposentadoria {
    public static int anosAposentar(Jogador jogador, int diaAtual, int mesAtual, int anoAtual) {
        int idade = jogador.idadeJogador(diaAtual, mesAtual, anoAtual);
        int idadeAposentadoria = 0;

        if (jogador.posicao.equalsIgnoreCase("defesa")) {
            idadeAposentadoria = 40;
        } else if (jogador.posicao.equalsIgnoreCase("meio-campo")) {
            idadeAposentadoria = 38;
        } else if (jogador.posicao.equalsIgnoreCase("atacante")) {
            idadeAposentadoria = 35;
        }

        return idadeAposentadoria - idade;
    }
}