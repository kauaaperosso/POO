public class Data{
    int dia;
    int mes;
    int ano;

    int intervaloAnos(int diaP, int mesP, int anoP){
        int diffAno = anoP - this.ano;

        if (mesP < this.mes || (mesP == this.mes && diaP < this.dia)) {
            diffAno--;
        }

        return diffAno;
    }
}
