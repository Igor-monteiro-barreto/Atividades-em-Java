package Estrutura_de_dados;

import java.util.Arrays;

public class tirarRepe {
    public static void main(String[] args) {
        //6) Escreva um programa que receba uma lista de números com possíveis elementos repetidos, remova os elementos
        //repetidos e exiba a lista resultante sem elementos repetidos.
        int[] matriz = {2, 2, 3, 2, 2, 2, 2, 3, 13, 2};
        int[] semRepe = removeDuplicates(matriz);

        System.out.println("Array sem Repetição: " + Arrays.toString(semRepe));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);

        return result;
    }
}
