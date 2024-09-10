package aula1.produto;  // Define o pacote onde as classes estão localizadas

import java.util.Scanner;  // Importa a classe Scanner para entrada de dados do usuário

// Classe que representa um produto
class Produto {
    // Atributos da classe Produto
    String nome;          // Nome do produto
    String marca;         // Marca do produto
    double precoCusto;    // Preço de custo do produto
    double precoVenda;    // Preço de venda do produto

    // Construtor para inicializar os atributos do produto
    public Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;          // Inicializa o atributo nome com o valor fornecido
        this.marca = marca;        // Inicializa o atributo marca com o valor fornecido
        this.precoCusto = precoCusto;  // Inicializa o atributo precoCusto com o valor fornecido
        this.precoVenda = precoVenda;  // Inicializa o atributo precoVenda com o valor fornecido
    }

    // Método que calcula o lucro do produto
    public double calcularLucro() {
        // Retorna a diferença entre o preço de venda e o preço de custo
        return precoVenda - precoCusto;
    }

    // Método para obter uma representação do produto como string
    public String toString() {
        // Retorna uma string com o nome e a marca do produto
        return "Nome: "+nome+"\nMarca: " + marca;
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do usuário
        Scanner scan = new Scanner(System.in);

        // Solicita ao usuário para digitar o nome do produto
        System.out.print("Digite o nome do produto:");
        // Lê a entrada do usuário para o nome do produto
        String nome = scan.nextLine();

        // Solicita ao usuário para digitar a marca do produto
        System.out.print("Digite a marca do produto:");
        // Lê a entrada do usuário para a marca do produto
        String marca = scan.nextLine();

        // Solicita ao usuário para digitar o preço de custo do produto
        System.out.print("Digite o preço de custo do produto:");
        // Lê a entrada do usuário para o preço de custo do produto e armazena como um double
        double precoCusto = scan.nextDouble();

        // Solicita ao usuário para digitar o preço de venda do produto
        System.out.print("Digite o preço de venda do produto:");
        // Lê a entrada do usuário para o preço de venda do produto e armazena como um double
        double precoVenda = scan.nextDouble();

        // Cria uma instância da classe Produto com os dados fornecidos pelo usuário
        Produto produto = new Produto(nome, marca, precoCusto, precoVenda);

        // Calcula o lucro usando o método calcularLucro da instância do produto
        double lucro = produto.calcularLucro();

        // Exibe o nome, a marca e o lucro do produto
        System.out.println("\n\nProduto: "+produto+"\nLucro: R$ "+lucro);

        // Fecha o objeto Scanner para liberar recursos
        scan.close();
    }
}
