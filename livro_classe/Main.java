
public class Main{
    public static void main(String[] args){
        
        Livro l = new Livro();
        l.imprimeLivro();
        l.titulo = "Manoel Gomes: The Hystory";
        l.autor = "Manoel Gomes";
        l.anoPublicacao = 2022;
        
        l.imprimeLivro();
    }

    }