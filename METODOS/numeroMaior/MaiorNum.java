package METODOS.numeroMaior;

import java.util.Scanner;

//define os parametros da classe numeroMaior
class numeroMaior {

    private double n1;
    private double n2;
    private double n3;

    //Contructo da classe
    public numeroMaior(double n1, double n2, double n3) {

        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    //metodo que separa o numero maior
    private double checkNum() {

        double maior;

        if (n2 < n1 && n3 < n1) { // se n1 for maior q n2 e n3
            maior = n1; //n1 é o maior
        } else if (n1 < n2 && n3 < n2) { // se n2 for maior q n3 e n1
            maior = n2; //n2 é o maior
        } else { // se não, n3 é o maior
            maior = n3;
        }

        return maior;
    }

    public double getCheckNum() {
        return checkNum();
    }
}

public class MaiorNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("escreva um número: ");
        double n1 = scan.nextDouble();

        System.out.print("escreva outro número: ");
        double n2 = scan.nextDouble();

        System.out.print("escreva um terceiro número: ");
        double n3 = scan.nextDouble();

        //cria o objeto da classe
        numeroMaior numero = new numeroMaior(n3, n3, n3);


        //checa qual o numero maior de acordo com o input do user
        double resultado = numero.getCheckNum();

        System.out.print("\n\n o maior numero entre: " + n1 + ", " + n2 + " e " + n3 + " é o numero: " + resultado);

        scan.close();
    }
}
