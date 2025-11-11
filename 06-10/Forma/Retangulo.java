public class Retangulo extends Forma{
    int base;
    int altura;

    public Retangulo(int base, int altura){
        this.base=base
        this.altura=altura
    }

    @override
    public double area(){
        System.out.println("Retangulo")
        double result;
        result = this.base*this.altura
        return result
    }
}