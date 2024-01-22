package br.com.casasbahia.listacompras.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista {
    private final Map<String, String> listaPedidos = new HashMap<>();
    private final Scanner leitura = new Scanner(System.in);

    public void adicionarItem() {
        System.out.println("Informe o nome do item que deseja adicionar: ");
        String item = leitura.nextLine();
        System.out.println("Informe a quantidade que deseja adicionar deste item: ");
        String quantidade = leitura.nextLine();

        listaPedidos.put(item, quantidade);
    }
    public void removerItem() {
        exibirLista();

        System.out.println("Informe o nome do item que deseja remover");
        String itemRemover = leitura.nextLine();

        if (listaPedidos.containsKey(itemRemover)) {
            listaPedidos.remove(itemRemover);
            System.out.println("Item da lista 1 removido com sucesso!");
        } else {
            throw new IllegalArgumentException("Este item não existe nas duas listas.");
        }
    }
    public void exibirLista() {
        System.out.println(listaPedidos);
    }
}
