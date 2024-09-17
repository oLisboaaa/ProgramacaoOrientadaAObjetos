package aula3.saque;

import java.util.Scanner;

class Banco{
    double saque;
    double deposito;
    double consulta;

    public Banco(double saque, double deposito, double consulta) {
        this.saque = saque;
        this.deposito = deposito;
        this.consulta = consulta;
    }

    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        Scanner scan = new Scanner(System.in);
        this.saque = saque;
        double taxa = 0.005;
        
        System.out.println("qual o valor a ser sacado?");
        saque = scan.nextDouble();
        
        taxa = saque * taxa;
        System.out.print("Sera cobrado uma taxa no valor de "+taxa);
        
        saque = this.saque + taxa;
        
        System.out.print("o valor total é de " + saque);
        return saque;
    }


    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        Scanner scan = new Scanner(System.in);
        this.deposito = deposito;
        double taxa = 0.01;
        
        System.out.println("qual valor voce deseja depositar?");
        this.deposito = scan.nextDouble();
            
        taxa = this.deposito * taxa;
            
        System.out.print("sera cobrado uma taxa de "+taxa);
            deposito = deposito + taxa;
            
        System.out.print("O valor total é de "+deposito);
        return deposito;
        }
    }


    public double getConsulta() {
        return consulta;
    }
    public void setConsulta(double consulta) {
        this.consulta = consulta;
        double taxa = 0.1;
    }



}

public class Itau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }

}
