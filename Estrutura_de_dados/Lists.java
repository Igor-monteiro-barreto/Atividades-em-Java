package Estrutura_de_dados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
    public static void main(String[] args) {
// 2) Implemente um programa que leia uma matriz 4x4 de números inteiros e, em seguida, calcule e exiba a soma de
//todos os elementos da matriz.
        int[][] Array={
                {4, 3,5 , 9},
                {5, 8, 9, 5},
                {1,3 ,7, 4},
                {3, 2 ,4, 2}
        };
        int soma = 0;

        for (int i = 0; i < 4; i++){
            for( int j = 0; j < 4; j++){
                soma += Array[i][j];
            }
        }
        System.out.println("A soma dos elementos internos da matiz é " + soma);

    }

}
