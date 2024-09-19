package METODOS.fatorial;

import java.util.Scanner;

// Define a classe Fatorial
class Fatorial {
    private double n1;
    
    // Construtor da classe para definir os atributos da classe
    public Fatorial(double n1) {
        this.n1 = n1;
    }

    // Metodo que faz o calculo do numero n1
    private double fazFator() {

        double numero = n1;

        double multiplicação = n1;

        while (numero > 1) {                              // While para multiplicar o numero por ele mesmo,
            multiplicação = multiplicação * (numero - 1);// apos isso, subitrair 1 e multiplicar novamente, 
            numero--;                                   // até n1 ser multilicado por 1
        }

        return multiplicação; // Retorna o resultado da operação

    }

    public double getFazFator() {
        return fazFator();
    }
}


// Cria a class main
public class Calculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = scan.nextDouble();

        // Cria o objeto do constructor da classe Fatorial
        Fatorial fatorial = new Fatorial(n1);

        // Cria uma variavel para realizar a operação
        Double resultado = fatorial.getFazFator();

        // Exibe o resultado final
        System.out.print("o valor fatorial de " + n1 + " é igual a:\n" + resultado);

        scan.close();
    }
}