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
    public void setSaque() {
        Scanner scan = new Scanner(System.in);
        double taxa = 0.005;
        
        System.out.println("qual o valor a ser sacado?");
        saque = scan.nextDouble();
        
        taxa = saque * taxa;
        System.out.print("Sera cobrado uma taxa no valor de "+taxa);
        
        saque = this.saque + taxa;
        
        System.out.print("\n\no valor total é de " + saque);
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
            
        System.out.print("sera cobrado uma taxa de "+taxa);
            deposito = deposito + taxa;
            
        System.out.print("\n\nO valor total é de "+deposito);
        }
    public double getConsulta() {
        return consulta;
    }
    public void setConsulta() {
        double taxa = 0.1;

    }
    
}







public class Itau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco(0, 0, 0);

        System.out.println("qual operacao voce quer realiza:\n[1] saque\n[2] deposito\n[3] consulta de saldo");
        int opcao = scan.nextInt();
        if(opcao == 1){
            banco.setSaque();
        }else if(opcao == 2){
            banco.setDeposito();
        }else{
            banco.setConsulta();
        }

        System.out.println("\n\n\nRESUMO DA SUA OPERACAO\n\nSaque: "+banco.getSaque()+"\nDeposito: "+banco.getDeposito()+"\nConsulta: "+banco.getConsulta());
        scan.close();
    }

}
