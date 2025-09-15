public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

/////sadfdsf
    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }
}