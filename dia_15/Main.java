import java.util.*;
import java.io.IOException;

public class Main{
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        p.nome = "Manoel Gomes";
        p.addContato(true,false,"59987654789");
        p.addContato(false,true,"59987654789");
        p.dtNasc=new Data(12,9,1990);

        p.imprimePessoa();
    }

    }