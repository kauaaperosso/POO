
public class Contato{
    boolean isWhats;
    boolean isTelegram;
    String numero;

    public Contato(){};

    public Contato(boolean isWhats, boolean isTelegram, String numero){
        this.isWhats = isWhats;
        this.isTelegram = isTelegram;
        this.numero = numero;
    }

    public String mostraContato() {
        String servicos = "";

        if (isWhats) {
            servicos += "WhatsApp";
        }
        if (isTelegram) {
            if (!servicos.isEmpty()) {
                servicos += ", ";
            }
            servicos += "Telegram";
        }

        if (!servicos.isEmpty()) {
            return "Número: " + this.numero + " (" + servicos + ")";
        } else {
            return "Número: " + this.numero;
        }
    }

    public String toString() {
        return mostraContato();
    }
}
