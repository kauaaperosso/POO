import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogador j = new Jogador();
        Data d = new Data();

        System.out.print("Digite o nome do jogador: ");
        j.nome = sc.nextLine();

        System.out.print("Digite a posição (defesa, meio-campo, atacante): ");
        j.posicao = sc.nextLine();

        System.out.print("Digite o dia de nascimento: ");
        d.dia = sc.nextInt();
        System.out.print("Digite o mês de nascimento: ");
        d.mes = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        d.ano = sc.nextInt();
        j.dataNascimento = d;

        sc.nextLine(); 

        System.out.print("Digite a nacionalidade: ");
        j.nacionalidade = sc.nextLine();

        System.out.print("Digite a altura (em metros): ");
        j.altura = sc.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        j.peso = sc.nextDouble();


        int diaHoje = 11;
        int mesHoje = 9;
        int anoHoje = 2025;

        j.mostrarInformacoes(diaHoje, mesHoje, anoHoje);

        int falta = Aposentadoria.anosAposentar(j, diaHoje, mesHoje, anoHoje);
        if (falta >= 0) {
            System.out.println("Faltam " + falta + " anos para se aposentar.");
        } else {
            System.out.println("Já passou da idade de aposentadoria!");
        }
    }
}
