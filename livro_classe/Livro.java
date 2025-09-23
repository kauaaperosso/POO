public class Livro{
    String titulo;
    String autor;
    int anoPublicacao;


    public Livro(){
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    
    void imprimeLivro(){
        System.out.println("----------Biblioteca---------------");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor(a): "+this.autor);
        System.out.println("Ano: "+this.anoPublicacao+"\n");

    }
    }
