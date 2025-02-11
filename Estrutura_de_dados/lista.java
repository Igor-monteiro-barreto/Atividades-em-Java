package Estrutura_de_dados;

import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();

    lista.add(1);
    lista.add(3);
    lista.add(5);

    for(int i = 0; i < lista.size(); i++){
        lista.add(i);
    }


        System.out.println("Listas: " + lista);
    }
}
