package Estrutura_de_dados;

import java.util.*;

public class Time {
    public static void main(String[] args) {
        // String e um array statico, tem tamanho fixo
        String [] nome = new String[6];

        // Listas

        List<String> nomeList = new ArrayList<>();

        // Stack | Pilhas

        Stack<String> nomePilha = new Stack<>();

        // Queues || Filas

        Queue<String> nomeListas = new LinkedList<>();
        nomeListas.add("Garp");
        nomeListas.add("Fujitora");
        nomeListas.add("Sakazuki");
        nomeListas.add("Aramaki");
        nomeListas.add("Kizaru");

        System.out.printf("Fila de Listas: " + nomeListas);

        // O metodo poll sempre vai retirar o primeiro elemento da Lista
        nomeListas.poll();
        System.out.printf("Fila de Listas: " + nomeListas);
        // Agora o peek ele OBSERVA quem e o primeiro da lista
        System.out.printf("Head da Flia: " + nomeListas.peek());

        // Esvasiando a fila com o for
        for (; !nomeListas.isEmpty(); ) {
            System.out.println("Removendo: " + nomeListas.poll());
            System.out.println("Fila de Listas: " + nomeListas);
        }


    }
}
