package br.com.casasbahia.listacompras.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista {
    private final Map<String, Integer> lista = new HashMap<>();
    private final Scanner leitura = new Scanner(System.in);
    private String item;
    private int quantidade;

    public void adicionarItem() {
        System.out.println("Informe o nome do item que deseja adicionar: ");
        this.item = leitura.nextLine();
        System.out.println("Qual seria a quantidade deste item? ");
        this.quantidade = leitura.nextInt();
        leitura.nextLine();

        lista.put(item, quantidade);
    }

    public void removerItem() {
        exibirLista();
        System.out.println("Informe o nome do item que deseja remover");
        String item_remover = leitura.nextLine();

        if (lista.containsKey(item_remover)) {
            lista.remove(item_remover);
            System.out.println("Item removido com sucesso!");
        } else {
            throw new IllegalArgumentException("Este item não existe na lista.");
        }
    }

    public void exibirLista() {
        System.out.println(lista);;
    }
}
