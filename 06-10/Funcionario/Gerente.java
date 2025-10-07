public class Gerente extends Funcionario {
    private double Bonus;

    public Gerente(){
        super();
    }
    public Gerente(double Salario, double Bonus){
        super(Salario);
        this.Bonus = Bonus;
    }
    
    double calculaRemuneracao(){
        return getSalario()*(1+Bonus);
    }
    
    void setBonus(double bo){
        this.Bonus = bo;
    }
    double getBonus(){
        return this.Bonus;
    }

    }
