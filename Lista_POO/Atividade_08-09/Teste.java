import java.util.*;
import java.io.IOException;

public class Teste{
    public static void main(String[] args){

        Data d = new Data();
        d.dia = 10;
        d.mes = 10;
        d.ano = 1950;

        System.out.println("Dif: " + d.intervaloAnos(10,10,2025));
    }
}