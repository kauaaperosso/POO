import java.util.*;
import java.io.IOException;

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
}
