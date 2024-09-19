package METODOS.mediaa;

import java.util.Scanner;

// Define a classe Media
class Media {
    private double n1; // n1 = numero 1
    private double n2; // n2 = numero 2
    private double n3; // n3 = numero 3

    // Cria o contructor da classe que define os atributos da classe
    public Media(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // variavel privada para realizar a operacao matematica
    private double dividir() {
        double mediaFeita = (n1 + n2 + n3) / 3; // Soma todos os numeros e divide pela quantidade de elementos

        return mediaFeita; // Retorna a operacao realizada
    }

    // Puxa a variavel privada e a torna publica
    public double getDividir() {
        return dividir();
    }
}

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("escreva um número: ");
        double n1 = scan.nextDouble();

        System.out.print("escreva outro número: ");
        double n2 = scan.nextDouble();

        System.out.print("escreva um terceiro número: ");
        double n3 = scan.nextDouble();

        // Cria uma instância da classe Media com os dados necessarios
        Media media = new Media(n1, n2, n3);

        // calcula o resultado com base no metodo privado criado anteriormente
        double resultado = media.getDividir();

        // exibe resultados
        System.out.println("\n\nA média aritimetica dos numeros " + n1 + ", " + n2 + "e " + n3 + " é de:" + resultado);

        scan.close();

    }
}