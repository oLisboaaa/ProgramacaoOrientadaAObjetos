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
        this.saque = saque;
        
    }


    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }


    public double getConsulta() {
        return consulta;
    }
    public void setConsulta(double consulta) {
        this.consulta = consulta;
    }



}

public class Itau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.close();
    }

}
