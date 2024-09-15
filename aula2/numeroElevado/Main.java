package aula2.numeroElevado;

import java.util.Scanner;
import java.lang.Math;

class numElevado {
    private double n1;
    private double n2;

    public numElevado(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;

    }

    private double eleva() {
        double resultado = Math.pow(n1, n2);

        return resultado;
    }

    public double getEleva() {
        return eleva();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva a o numero base: ");
        double n1 = scan.nextDouble();

        System.out.print("Escreva o expoente: ");
        double n2 = scan.nextDouble();

        numElevado expoente = new numElevado(n2, n2);

        double result = expoente.getEleva();

        System.out.print(n1 + " elevado a potencia de " + n2 + " resulta em: " + result);

        scan.close();
    }
}
