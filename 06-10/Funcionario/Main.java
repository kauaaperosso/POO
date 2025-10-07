public class Main{
    public static void main(String [] args){
        Funcionario f = new Funcionario();
        f.setSalario(2900.00);

        Gerente g = new Gerente();
        g.setSalario(2900.00);
        g.setBonus(0.3);

        System.out.println("Funcionario: R$"+f.calculaRemuneracao());
        System.out.println("Gerente: R$"+g.calculaRemuneracao());

    }
}