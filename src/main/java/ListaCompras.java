import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[]args) {
        int quant_itens;
        String itens;
        String resposta = "";
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitura.nextLine();

        Map<String, Integer> lista = new HashMap<>();

        while (!resposta.equals("n")) {

            System.out.println("O que você deseja adicionar na lista?");
            itens = leitura.nextLine();
            System.out.println("Qual a quantidade que deseja comprar deste item?");
            quant_itens = leitura.nextInt();
            leitura.nextLine();
            lista.put(itens, quant_itens);

            System.out.println("Desejar adicionar algo mais? [s/n]");
            resposta = leitura.nextLine();
        }
        System.out.println("Sua lista ficou desta forma: ");
        System.out.println(lista);

    }
}
