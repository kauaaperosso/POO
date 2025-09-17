import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Agenda agenda = new Agenda();
        //listão de pessoas kkkkk

        Pessoa p = new Pessoa();
        p.nome = "Manoel Gomes";
        p.addContato(true,false,"59987654789");
        p.addContato(false,true,"59987654789");
        p.dtNasc=new Data(12,9,1990);
        agenda.adicionarPessoa(p);

        Pessoa p2 = new Pessoa();
        p2.nome = "Débora Elle";
        p2.addContato(true,false,"59746594789");
        p2.addContato(false,true,"59746594789");
        p2.dtNasc=new Data(27,1,2007);
        agenda.adicionarPessoa(p2);

        Pessoa p3 = new Pessoa();
        p3.nome = "Kauan Pedroso";
        p3.addContato(true,false,"59983252789");
        p3.addContato(false,true,"59983252789");
        p3.dtNasc=new Data(3,3,2007);
        agenda.adicionarPessoa(p3);

        Pessoa p4 = new Pessoa();
        p4.nome = "Jair Messias";
        p4.addContato(true,false,"50123293789");
        p4.dtNasc=new Data(21,3,1955);
        agenda.adicionarPessoa(p4);

        //---------------------------------------------------

        agenda.listarPessoas();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa para buscar: ");
        String nomeBusca = scanner.nextLine();

        Pessoa encontrada = agenda.buscarNome(nomeBusca);
        if (encontrada != null) {
            System.out.println("Pessoa encontrada:");
            encontrada.imprimePessoa();
        } else {
            System.out.println("Pessoa não encontrada.");
        }

    }

    }