package aula2.positivoNegativo; // Define o pacote onde as classes estão localizadas

import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo teclado

// Define a classe PosNeg
class PosNeg {
    int n1; // Atributo para armazenar o número a ser verificado
    String resultado; // Atributo para armazenar o resultado da verificação

    // Construtor da classe PosNeg que aceita um parâmetro (n1) e inicializa o atributo n1
    public PosNeg(int n1) {
        this.n1 = n1; // Inicializa o atributo n1 com o valor fornecido
    }

    // Método para verificar se o número é positivo ou negativo
    public String verificaPosNeg() {
        // Verifica se o número é maior ou igual a zero
        if (n1 >= 0) {
            resultado = "positivo"; // Define resultado como "positivo" se a condição for verdadeira
        } else {
            resultado = "negativo"; // Define resultado como "negativo" se a condição for falsa
        }
        // Retorna o resultado da verificação
        return resultado;
    }
}

// Define a classe principal Main
public class Main {
    // Método principal que é o ponto de entrada do programa
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do teclado

        // Solicita ao usuário para digitar um número
        System.out.print("Digite um numero: ");
        int n1 = scan.nextInt(); // Lê o número digitado pelo usuário e armazena na variável n1

        // Cria um objeto da classe PosNeg passando o número digitado para o construtor
        PosNeg posNeg = new PosNeg(n1);

        // Chama o método verificaPosNeg para determinar se o número é positivo ou negativo
        String resultado = posNeg.verificaPosNeg();
        // Exibe o resultado para o usuário
        System.out.println("O numero " + n1 + " é " + resultado);

        scan.close(); // Fecha o objeto Scanner para liberar os recursos
    }
}