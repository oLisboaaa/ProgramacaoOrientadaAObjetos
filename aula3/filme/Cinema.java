package aula3.filme;

import java.util.Scanner;

class Filme {
    private String nome;
    private String genero;
    private int duracao;

    public Filme(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public void setNome() {
        Scanner scan = new Scanner(System.in);
        if (this.nome.isEmpty()) {
            System.out.print("Qual o nome do filme?: ");
            this.nome = scan.nextLine();
        }

        scan.close();
    }

    public void setGenero() {
        Scanner scan = new Scanner(System.in);
        if (this.genero.isEmpty()) {
            System.out.println("Digite se o filme é de:\nRomance\nTerror\nComedia\n\n");
            String inputGenero = scan.nextLine();
            if (inputGenero.equalsIgnoreCase("Romance") ||
                inputGenero.equalsIgnoreCase("Terror") ||
                inputGenero.equalsIgnoreCase("Comedia")) {
                this.genero = inputGenero;
            } else {
                System.out.println("Gênero inválido. Tente novamente.");
            }
        }

        scan.close();
    }

    public void setDuracao() {
        Scanner scan = new Scanner(System.in);
        if (this.duracao == 0) {
            System.out.print("Qual a duração do filme em minutos?: ");
            this.duracao = scan.nextInt();
        }

        scan.close();
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        int horas = duracao / 60;
        int min = duracao % 60;
        return String.format("%d:%02d", horas, min);
    }
}

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Filme filme = new Filme("", "", 0);
        
        filme.setNome();
        filme.setGenero();
        filme.setDuracao();
        
        System.out.println("\n\nNome do filme: " + filme.getNome()+
        "\nGênero do filme: " + filme.getGenero()+
        "\nDuração do filme: " + filme.getDuracao());
        
        scan.close();
    }
}
