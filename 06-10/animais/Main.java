public class Main{
    public static void main(String [] args){
        Lobo l = new Lobo();
        l.imagem = "Peludo";
        l.dieta = "Carnívoro";
        l.imprimeAnimal();

        Hipopotamo h = new Hipopotamo();
        h.imagem = "Grande";
        h.dieta = "Herbívoro";
        h.imprimeAnimal();

        Onca o = new Onca();
        o.imagem = "Pintada";
        o.dieta = "Carnívoro";
        o.imprimeAnimal();

        Gato g = new Gato();
        g.imagem = "Pequeno";
        g.dieta = "Carnívoro";
        g.imprimeAnimal();

        Cachorro c = new Cachorro();
        c.imagem = "Bobão";
        c.dieta = "Carnívoro";
        c.imprimeAnimal();

        Leao le = new Leao();
        le.imagem = "Grande e Peludo";
        le.dieta = "Carnívoro";
        le.imprimeAnimal();
    }
}