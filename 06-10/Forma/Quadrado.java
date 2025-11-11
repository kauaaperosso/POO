public class Quadrado extends Forma{
    int lado;

    public Quadrado(int lado){
        this.lado=lado
    }
    @override
    public double area(){
        System.out.println("Quadrado")
        double result;
        result = this.lado*this.lado
        return result
    }
}