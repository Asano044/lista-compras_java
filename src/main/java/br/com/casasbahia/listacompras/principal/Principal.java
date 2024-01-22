package br.com.casasbahia.listacompras.principal;

import br.com.casasbahia.listacompras.model.Lista;

import java.util.Scanner;

public class Principal {
    private final Scanner leitura = new Scanner(System.in);
    private final Lista lista = new Lista();
    void menu() {
        final String menu = """
                ************************
                    Lista de compras
                ************************
                """;

        System.out.println(menu);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println(
                    """
                       Qual opção você deseja?
                       1 - Adicionar um item na lista
                       2 - Apagar um item da lista
                       3 - Exibir os itens da lista
                       0 - sair        
                    """
            );
            opcao = leitura.nextInt();
            leitura.nextLine();

//            Começo do switch case
            switch (opcao) {
                case 1:
                    lista.adicionarItem();
                    break;
                case 2:
                    lista.removerItem();
                    break;
                case 3:
                    lista.exibirLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Esta opção não está configurada, tente outra");
                    break;

            }
//          Fim do switch
        }
//        Fim do laço while
    }
}
