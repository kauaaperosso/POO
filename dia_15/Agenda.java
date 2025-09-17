public class Agenda {
    Pessoa[] pessoas;
    int numPessoas;

    public Agenda() {
        this.pessoas = new Pessoa[15];
        this.numPessoas = 0;
    }

    public void adicionarPessoa(Pessoa p) {
        if (numPessoas >= 15) {
            System.out.println("Agenda cheia!");
        } else {
            pessoas[numPessoas] = p;
            numPessoas++;
        }
    }

    public void listarPessoas() {
        System.out.println("=== Lista de Pessoas na Agenda ===");
        for (int i = 0; i < numPessoas; i++) {
            pessoas[i].imprimePessoa();
            System.out.println("--------------------------");
        }
    }

    public Pessoa buscarNome(String nome) {
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].nome.equalsIgnoreCase(nome)) {
                return pessoas[i];
            }
        }
        return null;
    }
}
