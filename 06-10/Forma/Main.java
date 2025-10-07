public class Main{
    public static void main(String [] args){
        Forma f = new Forma();
        f.x = 23;
        f.y = 32;
        f.imprimePosicao();

        Quadrado q= new Quadrado();
        q.x = 12;
        q.y = 23;
        q.imprimePosicao();

        Circulo c= new Circulo();
        c.x = 20;
        c.y = 44;
        c.imprimePosicao();
    }
}