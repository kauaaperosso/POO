abstract class Forma{
    int x;
    int y;

    public abstract double area();
    
    void imprimePosicao(){
        System.out.println("\tX: "+ this.x + " Y: "+ this.y);
    }
}