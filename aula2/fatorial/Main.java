package aula2.fatorial;

import java.util.Scanner;


class Fatorial{
    private double n1;

    public void setFatorial(double n1){
        this.n1 = n1;
    }

    private double fazFator(){

        double numero = n1;

        double multiplicação = n1;

        while (numero > 1) {
            multiplicação = multiplicação * (numero-1);
            numero--;
        }
        
        return multiplicação;

    }

    public double getFazFator(){
        return fazFator();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = scan.nextDouble();

        Fatorial fatorial = new Fatorial();

        fatorial.setFatorial(n1);

        Double resultado = fatorial.getFazFator();


        System.out.print("o valor fatorial de "+n1+" é igual a:\n"+resultado);


        scan.close();
    }
}
