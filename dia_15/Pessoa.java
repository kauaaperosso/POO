public class Pessoa{
    String nome;
    Data dtNasc;
    Contato[] contatos;

    int numContatos;

    public Pessoa(){
        this.numContatos = 0;
        this.contatos = new Contato[4];
    }

    void addContato(boolean isWhats, boolean isTelegram, String numero){
        if(numContatos > 3){
            System.out.println("Limite de contatos excedido!!");
        }else{
            Contato novo = new Contato();
            this.contatos[numContatos] = novo;

            this.contatos[numContatos].isTelegram = isTelegram;
            this.contatos[numContatos].isWhats = isWhats;
            this.contatos[numContatos].numero = numero;

            this.numContatos++;
        }
    }

    public void listarContatos() {
        for (int i = 0; i < numContatos; i++) {
            System.out.println(this.contatos[i]);
        }
    }

    void imprimePessoa(){
        System.out.println(this.nome);
        System.out.println(this.dtNasc.dataString());
        listarContatos();
    }
}