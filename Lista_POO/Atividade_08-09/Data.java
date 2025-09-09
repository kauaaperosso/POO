public class Data{
    int dia;
    int mes;
    int ano;

    int intervaloAnos(int diaP, int mesP, int anoP){
        int diffAno = anoP - this.ano;
        if (mesP > mes)
            diffAno--;
        else 
        if (mesP == this.mes && diaP < dia)
             diffAno--;
    
        return diffAno;
    }
}
