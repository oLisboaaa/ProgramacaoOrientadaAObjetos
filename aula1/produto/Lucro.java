package aula1.produto;

import java.util.Scanner;

// Classe que representa um produto
class Produto {
    // Atributos da classe Produto
    String nome;          
    String marca;         
    double precoCusto;    
    double precoVenda;    

    // Construtor para inicializar os atributos do produto
    public Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;         
        this.marca = marca;        
        this.precoCusto = precoCusto;  
        this.precoVenda = precoVenda;  
    }

    // Método que calcula o lucro do produto
    public double calcularLucro() {
    
        return precoVenda - precoCusto;
    }

    // Método para obter uma representação do produto como string
    public String produtoLista() {
        
        return "Nome: "+nome+"\nMarca: " + marca;
    }
}

// Classe principal que contém o método main
public class Lucro {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do usuário
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("Digite a marca do produto: ");
        String marca = scan.nextLine();

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scan.nextDouble();

        System.out.print("Digite o preço de venda do produto: ");
        double precoVenda = scan.nextDouble();

        // Cria uma instância da classe Produto com os dados fornecidos pelo usuário
        Produto produto = new Produto(nome, marca, precoCusto, precoVenda);

        String lista = produto.produtoLista();

        // Calcula o lucro usando o método calcularLucro da instância do produto
        double lucro = produto.calcularLucro();

        // Exibe o nome, a marca e o lucro do produto
        System.out.println("\n\nProduto: \n"+lista+"\nLucro: R$ "+lucro);

        scan.close();
    }
}
