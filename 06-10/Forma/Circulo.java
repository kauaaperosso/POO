public class Circulo extends Forma{
    int raio;

    public Circulo(int raio){
        this.raio=raio
    }

    @override
    public double area(){
        System.out.println("Circulo")
        double result;
        result = this.raio*this.raio * Math.PI
        return result
    }
}