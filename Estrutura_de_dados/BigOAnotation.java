package Estrutura_de_dados;

import java.util.ArrayList;
import java.util.LinkedList;

public class BigOAnotation {
    public static void main(String[] args) {
        long inicio;
        long tempo;
        long fim;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(Integer i =0 ; i < 100; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        inicio = System.nanoTime();
        arrayList.get(0);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Performace do array List: " + tempo + " ns");


        inicio = System.nanoTime();
        linkedList.get(0);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Performace do Linked List: " + tempo + " ns");


    }
}
