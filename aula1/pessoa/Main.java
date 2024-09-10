package aula1.pessoa;

import java.util.Scanner;

class Pessoa {
    String nome;
    String sobrenome;
    String dataNasc;
    String CPF;
    String email;
    String userEmail;

    public Pessoa(String nome, String sobrenome, String dataNasc, String CPF, String email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.email = email;
        this.userEmail = nome+"."+sobrenome;
    }



    private String gerarEmail(String userEmail){
        String dominio = "facens.br";

        return userEmail+"@"+dominio;
    }
}
