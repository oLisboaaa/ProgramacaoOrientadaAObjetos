package METODOS.numeroElevado;

import java.util.Scanner;
import java.lang.Math;

//define os parametros dda classe numElevado
class numElevado {
    private double n1;
    private double n2;

    //Contructor da classe
    public numElevado(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;

    }

    //metodo q efetua a operação
    private double eleva() {
        double resultado = Math.pow(n1, n2); //Math.pow é um metodo para efetuar operações complexas
        //"pow" se refere a "power of", ou "elevado a"

        return resultado;
    }

    public double getEleva() {
        return eleva();
    }
}

public class Expoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva a o numero base: ");
        double n1 = scan.nextDouble();

        System.out.print("Escreva o expoente: ");
        double n2 = scan.nextDouble();

        // cria objeto para puxar o contructor da classe
        numElevado expoente = new numElevado(n2, n2);

        //puxa o metodo q vai operar o numero selecionado pel usuario "numero 1(n1)"
        double result = expoente.getEleva();

        System.out.print(n1 + " elevado a potencia de " + n2 + " resulta em: " + result);

        scan.close();
    }
}
