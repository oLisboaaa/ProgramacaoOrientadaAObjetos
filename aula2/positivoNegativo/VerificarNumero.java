package aula2.positivoNegativo;

import java.util.Scanner;

// Define a classe PosNeg
class PosNeg {
    int n1;
    String resultado;

    // Construtor da classe
    public PosNeg(int n1) {
        this.n1 = n1;
    }

    // Método para verificar se o número é positivo ou negativo
    public String verificaPosNeg() {
        // Verifica se o número é maior ou igual a zero
        if (n1 >= 0) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        }
        return resultado;
    }
}


public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = scan.nextInt();

        // Cria um objeto da classe
        PosNeg posNeg = new PosNeg(n1);

        /*
        Chama o método verificaPosNeg para determinar se o número é positivo ou
        negativo
        */
        String resultado = posNeg.verificaPosNeg();

        System.out.println("O numero " + n1 + " é " + resultado);

        scan.close(); 
    }
}