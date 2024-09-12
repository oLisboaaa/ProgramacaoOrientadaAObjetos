package aula2.media;

import java.util.Scanner;

class Media{
    private double n1;
    private double n2;
    private double n3;
    
    public media(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    private double dividir(){
        mediaFeita = (n1 + n2 + n3) / 3;
        
        return mediaFeita;
    }
    
    public double getDividir(){
        return dividir();
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("escreva um número: ");
        double n1 = scan.nextDouble;
        
        
        System.out.print("escreva outro número: ");
        double n2 = scan.nextDouble;
        
        
        System.out.print("escreva um terceiro número: ");
        double n3 = scan.nextDouble;
        
        double resultado = Media.getDividir();
        
        System.out.println("\n\nA média aritimetica dos numeros "+n1+", "+n2+"e "+n3+" é de:" +resultado);
        
    }
}
