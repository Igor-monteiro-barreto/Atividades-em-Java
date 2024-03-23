import java.util.ArrayList;
import java.util.Scanner;
class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n*** Menu ***");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double valorProduto = scanner.nextDouble();

                    Produto novoProduto = new Produto(nomeProduto, valorProduto);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            System.out.printf("[%d] %s - R$ %.2f%n", i + 1, produto.getNome(), produto.getValor());
        }

        scanner.close();
    }
}