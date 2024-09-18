package aula3.saque;

import java.util.Scanner;

class Banco {
    double saque;
    double deposito;
    double consulta;
    double saldoAtual;
    int numConsulta;

    public Banco(double saque, double deposito, double consulta, double saldoAtual) {
        this.saque = saque;
        this.deposito = deposito;
        this.consulta = consulta;
        this.saldoAtual = saldoAtual;
        this.numConsulta = 0;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque() {
        Scanner scan = new Scanner(System.in);
        double taxa = 0.005;

        System.out.println("qual o valor a ser sacado?");
        saque = scan.nextDouble();

        taxa = saque * taxa;

        System.out.print("Sera cobrado uma taxa no valor de " + taxa);
        saque = this.saque + taxa;

        this.saldoAtual -= saque;

        System.out.print("\n\no valor total é de " + saque);

        scan.close();
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito() {
        Scanner scan = new Scanner(System.in);
        double taxa = 0.01;

        System.out.println("qual valor voce deseja depositar?");
        this.deposito = scan.nextDouble();
        taxa = this.deposito * taxa;

        System.out.print("sera cobrado uma taxa de " + taxa);
        deposito = deposito - taxa;

        this.saldoAtual += deposito;

        System.out.print("\n\nO valor total é de " + deposito);

        scan.close();
    }

    public double getConsulta() {
        return consulta;
    }

    public void setConsulta() {
        Scanner scan = new Scanner(System.in);

        double taxa = 0.1;

        numConsulta++;
        System.out.println("Seu saldo atual é de " + saldoAtual + "\n voce realizou " + numConsulta
                + " a cada 5 consultas será cobrado uma taxa de R$ 0,10");

        if (numConsulta % 5 == 0) {
            saldoAtual -= taxa;
            System.out.printf(
                    "Número de consultas gratuitas excedido. Taxa de R$ 0,10 cobrada. Saldo atual:\n" + saldoAtual);
        }

        scan.close();
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

}

public class Itau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Banco banco = new Banco(0, 0, 0, 1000);


        while (true) {
            System.out.println("qual operacao voce quer realiza:\n[1] saque\n[2] deposito\n[3] consulta de saldo");
            int opcao = scan.nextInt();
            if (opcao == 1) {
                banco.setSaque();
            } else if (opcao == 2) {
                banco.setDeposito();
            } else if (opcao == 3) {
                banco.setConsulta();
            } else{
                System.out.println("opcao invalida");
            }


            System.out.println("\n\n\nDeseja fazer outra operacao? [1] sim [2] nao");
            int confirma = scan.nextInt();


            if (confirma == 2) {
                System.out.println("\n\n\nRESUMO DA SUA OPERACAO\n\nSaque: " + banco.getSaque() + "\nDeposito: "
                        + banco.getDeposito() + "\nSaldo: " + banco.getSaldoAtual());
                break;
            }
        }

        scan.close();
    }

}
