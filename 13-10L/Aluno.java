public class Aluno extends Faculdade{

    private String curso;
    
    public String getCurso(){
        return curso;
    }

    public String setCurso(String curso){
        this.curso = curso;
        
    }

    public void imprimeDescrição(){
        System.out.println("Nome: "+ this.getNome() + "Descrição: " + this.getCurso()+"\n");
    }
}