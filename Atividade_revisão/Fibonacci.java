package Atividade_revisão;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Formula de Fibonacci F(n) = F(n - 1) + F(n - 2)

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o N da formula Fibonacci: \n");
        int n = scan.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        if (n == 0){
            proximo = 0;
        }
        else if (n == 1) {
            proximo = 1;
        } else {
            for (int i = 2; i <= n; i++){
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
                // Essa foi a parte mais confusa para se fazer primeiro, não e nem pela
                //logica do looping mas pela soma das variaveis eu fiquei tipo por que
                //esses numeros não ficarão iguais a 1? mas não esse numeros eles não são fixados
                //neste caso ele so vem para essa parte do codigo caso seja maior que 3 e lembre-se
                // as variaveis proximo, primeiro e segundo, elas aumentam com o passar do looping
                // ou seja na primeira vez rodando o proximo vira 1 o segundo vira 2 e o primeiro vira 1
            }
        }

        System.out.println("A sequancia de Fibonacci deste numero é "+ proximo);
        scan.close();
    }
}
