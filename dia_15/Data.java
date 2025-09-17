public class Data{
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){

    }

    public boolean compara (Data d){
        return this.dia == d.dia && this.mes == d.mes && this.ano == d.ano;
    }
    public int diffAnos (Data d){

        int resultado = Math.abs(this.ano - d.ano);

        if (this.ano == d.ano){
            if (this.mes < d.mes){
                resultado--;
            }else if(this.mes == d.mes){
                if (this.dia < d.dia){
                    resultado--;
                }
            }
        }
        return resultado;
    }

    String dataString(){
        return this.dia +"/" +this.mes +"/" +this.ano;
    }
}
