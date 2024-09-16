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
            System.out.print("Qual o nome do filme?: ");
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

        while (genFilme.isEmpty()) {

            if (genFilme == "1") {

                genFilme = "Romance";

            } else if (genFilme == "2") {

                genFilme = "Terror";

            } else if (genFilme == "3") {
                genFilme = "Comedia";
            }
        }

        scan.close();
        return genFilme;

    }

    public String getGenero() {
        return genero();
    }

    private String duracao() {
        int horas = duracao / 60;
        int min = duracao % 60;

        String horaFormat = String.format("%d:%02d", horas, min);

        return horaFormat;
    }

    public String getDuracao() {
        return duracao();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o nome do filme");
        String nome = scan.nextLine();
        
        System.out.println("Digite uma opção:\n(1) Romance\n(2) Terror\n(3) Comedia): ");
        String genero = scan.nextLine();
        
        System.out.println("qual a duração do filme?");
        int duracao = scan.nextInt();
        
        Filme filme = new Filme(nome, genero, duracao);

        String nm = filme.getNome();
        String gen = filme.getGenero();
        String dur = filme.getDuracao();

        System.out.println(nm + "\n" + gen + "\n" + dur);

        scan.close();
    }

}
