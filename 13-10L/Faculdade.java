abstract class Faculdade{
    private String nome;
    public String getNome(){
        return nome;
    }
    public String setNome(String nome){
        this.nome = nome;
    }
    
    public void imprimeDescrição(){
        System.out.println("Nome: "+ this.getNome());
    }
}