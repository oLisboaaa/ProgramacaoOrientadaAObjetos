package aula1.pessoa;

import java.util.Scanner;

class gPessoa {
   String nome;
   String sobrenome;
   String dataNasc;
   int altura;
   String email;

   public gPessoa(String nome, String sobrenome, String dataNasc, int altura, String email) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.dataNasc = dataNasc;
      this.altura = altura;
      this.email = email;
   }

   public String getNomeCompleto() {
      return nome + " " + sobrenome;
   }

   public void setNomeCompleto() {
      Scanner scan = new Scanner(System.in);

      System.out.println("qual o primeiro nome?");
      nome = scan.nextLine();

      System.out.println("\nqual o ultimo nome?");
      sobrenome = scan.nextLine();
   }

   public String getDataNasc() {
      return dataNasc;
   }

   public void setDataNasc() {
      Scanner scan = new Scanner(System.in);
      System.out.print("\n\nInsira a data de nascimento do usuário (ddMMyyyy / Somente números): ");
      dataNasc = scan.nextLine();

   }

   public int getAltura() {
      return altura;
   }

   public void setAltura() {
      Scanner scan = new Scanner(System.in);
      System.out.println("\n\nQual a altura?");
      altura = scan.nextInt();

   }

   public String getEmail() {
      return email;
   }

   public void setEmail() {
      email = nome + "." + sobrenome + "@facens.br";
   }

}

public class Pessoa {
   public static void main(String[] args) {

      gPessoa gpessoa = new gPessoa("", "", "", 0, "");

      gpessoa.setNomeCompleto();
      gpessoa.setDataNasc();
      gpessoa.setAltura();
      gpessoa.setEmail();

      System.out.println(
            "\n\nNome: " + gpessoa.getNomeCompleto() +
            "\nData de nascimento: " + gpessoa.getDataNasc() +
            "\nAltura: " + gpessoa.getAltura() +
            "\nEmail: " + gpessoa.getEmail());

   }
}