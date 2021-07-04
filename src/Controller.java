import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        // Declaração da referencia ao objeto scanner
        Scanner sc = new Scanner(System.in);
        ListaTelefonica listatelefonica = new ListaTelefonica();

        while(true) {
            System.out.println("---- Lista Telefonica ----" +
                    "\nEscolha uma opção:" +
                    "\n1 - Visualizar sua lista telefonica" +
                    "\n2 - Buscar um contato" +
                    "\n3 - Criar um novo contato" +
                    "\n4 - Atualizar um contato existente" +
                    "\n5 - Deletar um contato" +
                    "\n6 - Sair do Programa");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(listatelefonica.toString());
                    break;
                case 2:
                    System.out.println("Digite o nome do contato");
                    String nome = sc.next();
                    System.out.println(listatelefonica.buscarContato(nome));
                    break;
                case 3:
                    System.out.println("Digite o nome e telefone do contato");
                    nome = sc.next();
                    String telefone = sc.next();
                    System.out.println(listatelefonica.adicionar(nome, telefone));
                    break;
                case 4:
                    System.out.println("Digite o nome do contato existente");
                    nome = sc.next();
                    // listatelefonica.atualizar(nome);
                    break;
                case 5:
                    System.out.println("Digite o nome do contato");
                    nome = sc.next();
                    System.out.println(listatelefonica.deletar(nome));
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}