package br.com.fcamara.Contatos;

import br.com.fcamara.Contatos.modelo.ListaTelefonica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws IOException {
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
            Scanner entrada = new Scanner(System.in);

            switch (opcao) {
                case 1:
                    System.out.println(listatelefonica.toString());
                    break;
                case 2:
                    System.out.println("Digite o nome do contato: ");
                    String nome = entrada.nextLine();
                    System.out.println(listatelefonica.buscarContato(nome));
                    break;
                case 3:
                    System.out.print("Digite o nome do contato: ");
                    nome = entrada.nextLine();
                    System.out.print("Digite o telefone do contato Ex( XX XXXXX-XXXX ): ");
                    String telefone = entrada.nextLine();
                    System.out.println(listatelefonica.adicionar(nome, telefone));
                    break;
                case 4:
                    System.out.print("Digite o nome atual do contato: ");
                    String nomeAtual = entrada.nextLine();
                    System.out.print("Digite o novo nome do contato: ");
                    String nomeNovo = entrada.nextLine();
                    System.out.print("Digite o novo telefone do contato Ex( XX XXXXX-XXXX ): ");
                    String telefoneNovo = entrada.nextLine();
                    System.out.println(listatelefonica.atualizar(nomeAtual, nomeNovo, telefoneNovo));
                    break;
                case 5:
                    System.out.print("Digite o nome do contato: ");
                    nome = entrada.nextLine();
                    System.out.println(listatelefonica.deletar(nome));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Digite uma opção válida!");
            }
            System.out.println("Pressione qualquer tecla para continuar.");
            System.in.read();
        }
    }
}