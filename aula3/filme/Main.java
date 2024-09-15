package aula3.filme;

import java.util.Scanner;

class Filme {
    String nome;
    String genero;
    int duracao;

    public Filme(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    private String nome() {
        Scanner scan = new Scanner(System.in);
        String nomeFilme = "";

        while (nomeFilme.isEmpty()) {
            System.out.println("Digite uma string (não deixe em branco): ");
            nomeFilme = scan.nextLine();
        }

        scan.close();
        return nomeFilme;
    }

    public String getNome() {
        return nome();
    }

    private String genero() {
        Scanner scan = new Scanner(System.in);
        String genFilme = "";

        while (true) {
            System.out.println("Digite uma opção (Romance, Terror, Comédia): ");
            genFilme = scan.nextLine().trim(); // Remove espaços em branco ao redor

            if (genFilme.equalsIgnoreCase("Romance") ||
                genFilme.equalsIgnoreCase("Terror") ||
                genFilme.equalsIgnoreCase("Comédia")) {

                    return genFilme;

            } else {

                System.out.println("Entrada inválida. Tente novamente.");

            }

            scan.close();

        }
    }

    public String getGenero(){
        return genero();
    }





}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        String genero = "";
        int duracao = 0;
        Filme filme = new Filme(nome, genero, duracao);


        scan.close();
    }

}
