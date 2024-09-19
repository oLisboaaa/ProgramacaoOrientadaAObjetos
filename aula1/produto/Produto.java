package aula1.produto;

import java.util.Scanner;

// Classe que representa um produto
class Lucro {
    // Atributos da classe Produto
    String nome;          
    String marca;         
    double precoCusto;    
    double precoVenda;   
    double lucro; 

    public Lucro (String nome, String marca, double precoCusto, double precoVenda, double lucro)  {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda; 
        this.lucro = lucro;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        nome = scan.nextLine();

    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(){
        Scanner scan = new Scanner(System.in);

        System.out.println("qual a marca desse produto?");
        marca = scan.nextLine();

    }

    public double getPrecoCusto(){
        return precoCusto;
    }

    public void setPrecoCusto(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preco de custo do produto "+marca);
        precoCusto = scan.nextDouble();
    }   
    
    public double getPrecoVenda(){
        return precoVenda;
    }

    public void setPrecoVenda(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preco de venda do produto "+marca);
        precoVenda = scan.nextDouble();
    }

    public double getlucro(){
        return lucro;
    }

    public void setLucro(){
        lucro = precoVenda - precoCusto;
    }

}

public class Produto{
    public static void main(String[] args) {
        Lucro lucro = new Lucro("","", 0, 0, 0);

        lucro.setNome();
        lucro.setMarca();
        lucro.setPrecoCusto();
        lucro.setPrecoVenda();
        lucro.setLucro();

        System.out.println(
            "\n\nnome:"+lucro.getNome()+
            "\nmarca: "+lucro.getMarca()+
            "\npreco de custo: R$"+lucro.getPrecoCusto()+
            "\npreco de venda: R$"+lucro.getPrecoVenda()+
            "\n\nLUCRO SOB PRODUTO: R$"+lucro.getlucro());
        }

}