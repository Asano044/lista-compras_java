package br.com.casasbahia.listacompras.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista {
    private final Map<String, Integer> listaPedidos = new HashMap<>();
    private final Map<String, String> lista2 = new HashMap<>();
    private final Scanner leitura = new Scanner(System.in);

    private String item;

    public void adicionarItem(String item, Integer quantidade) {
        this.item = item;
        listaPedidos.put(this.item, quantidade);
    }

    public void adicionarItem(String item, String quantidadeStr) {
        this.item = item;

        lista2.put(this.item, quantidadeStr);
    }

    public void removerItem() {
        exibirLista();

        System.out.println("Informe o nome do item que deseja remover");
        String itemRemover = leitura.nextLine();

        if (listaPedidos.containsKey(itemRemover)) {
            listaPedidos.remove(itemRemover);
            System.out.println("Item da lista 1 removido com sucesso!");
        } else if (lista2.containsKey(itemRemover)) {
            lista2.remove(itemRemover);
            System.out.println("Item da lista 2 removido com sucesso!");
        }
        else {
            throw new IllegalArgumentException("Este item não existe nas duas listas.");
        }
    }

    public void exibirLista() {
        System.out.println(listaPedidos);
        System.out.println(lista2);
    }
}
