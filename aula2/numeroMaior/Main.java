package aula2.numeroMaior;

import java.util.Scanner;

class numeroMaior{
    
    private double n1;
    private double n2;
    private double n3;
    
    
    public void setNumeroMaior(double n1, double n2, double n3){
    
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    }
    
    
    private double checkNum(){
        
        double maior;
        
        if (n2 < n1 && n3 < n1) {
            maior = n1;
        } else if (n1 < n2 && n3 < n2) {
            maior = n2;
        } else {
            maior = n3;
        }
        
        return maior;
    }
    
    public double getCheckNum(){
        return checkNum();
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
        System.out.print("escreva um número: ");
        double n1 = scan.nextDouble();

        System.out.print("escreva outro número: ");
        double n2 = scan.nextDouble();

        System.out.print("escreva um terceiro número: ");
        double n3 = scan.nextDouble();
        
        numeroMaior numero = new numeroMaior();
        
        numero.setNumeroMaior(n1, n2, n3);
        
        double resultado = numero.getCheckNum();
        
        
        System.out.print("\n\n o maior numero entre: "+n1+", "+n2+" e "+n3+" é o numero: "+resultado);
        
        scan.close();
	}
}
