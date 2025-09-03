import java.io.IOException;
import java.util.Scanner;

public class Exercicio09{

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 JAVA atrapalham muita gente");

        for (int i=2; i<= 100; i++){
            String frase = i + " JAVA";
            for (int j=0;j<i;j++){
                frase += " atrapalham";
            }

            frase+=" muita gente";
            System.out.println(frase);
        }
    }
	
	}

