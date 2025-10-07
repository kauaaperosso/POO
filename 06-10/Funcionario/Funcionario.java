public class Funcionario{
    private double Salario;

    public Funcionario(){    }
    public Funcionario(double Salario){}
    
    double calculaRemuneracao(){
        return this.Salario;
    }
    void setSalario(double sal){
        this.Salario = sal;
    }
    double getSalario(){
        return this.Salario;
    }
}