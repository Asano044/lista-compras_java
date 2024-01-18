package br.com.casasbahia.listacompras.service;


import br.com.casasbahia.listacompras.model.Lista;

import java.util.Scanner;

public class Filtro {
    private final Scanner leitura = new Scanner(System.in);
    private String quantidadeStr;

    public void filtrar(Lista lista) {
        System.out.println("Informe que item deseja adicionar: ");
        String item = leitura.nextLine();

        System.out.println("""
                Qual será a unidade de medida da quantidade? 
                1 - unidade
                2 - grama
                3 - real
                """);

        int opcao = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Qual a quantidade do item? ");
        switch (opcao) {
            case 1:
                int quantidadeInt = leitura.nextInt();
                lista.adicionarItem(item, quantidadeInt);
                leitura.nextLine();
                break;
            case 2:
                this.quantidadeStr = leitura.nextLine();
                converterKg(quantidadeStr);
                lista.adicionarItem(item, quantidadeStr);
                break;
            case 3:
                this.quantidadeStr = leitura.nextLine();
                converterReal(quantidadeStr);
                lista.adicionarItem(item, quantidadeStr);
                break;
            default:
                System.out.println("Eta opção não está registrada.");
                break;

        }
//        Fim do switch
    }
//    Fim do método filtrar()

    public void converterKg(String quantidadeStr) {
        double resultado = Double.parseDouble(quantidadeStr);
        if (resultado >= 1000) {
            this.quantidadeStr = resultado + "Kg";
        } else {
            this.quantidadeStr = resultado + "g";
        }
    }

    public void converterReal(String quantidadeStr) {
        this.quantidadeStr = "R$" + Double.parseDouble(quantidadeStr);
    }

}