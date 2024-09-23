package PRODUTO.pessoa;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class gPessoa {
   private String nome;
   private String sobrenome;
   private Date dataNasc;
   private double altura;
   private String email;

   public gPessoa(String nome, String sobrenome, Date dataNasc, double altura, String email) {
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

      System.out.println("Qual o primeiro nome?");
      nome = scan.nextLine();

      System.out.println("\nQual o último nome?");
      sobrenome = scan.nextLine();
   }

   public Date getDataNasc() {
      return dataNasc;
   }

   public void setDataNasc() {
      Scanner scan = new Scanner(System.in);
      System.out.print("\n\nInsira a data de nascimento do usuário (ddMMyyyy / Somente números): ");
      String dataStr = scan.nextLine();

      try {
         SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
         this.dataNasc = sdf.parse(dataStr);

         // Verifica se a data de nascimento é anterior à data atual
         if (dataNasc.after(new Date())) {
            System.out.println("Data inválida. A data de nascimento não pode ser posterior à data atual.");
            setDataNasc(); // Chama novamente se a data for inválida
         }
      } catch (Exception e) {
         System.out.println("Data inválida. Tente novamente.");
         setDataNasc(); // Chama novamente se a data for inválida
      }
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura() {
      Scanner scan = new Scanner(System.in);
      System.out.println("\n\nQual a altura? (EM CENTIMETROS)");
      altura = scan.nextInt();
      altura /= 100; // Converte para metros
   }

   public String getEmail() {
      return email.toLowerCase();
   }

   public void setEmail() {
      email = nome + "." + sobrenome + "@facens.br";
   }

   public String formatarDataNasc() {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      return sdf.format(dataNasc);
   }
}

public class Pessoa {
   public static void main(String[] args) {
      gPessoa gpessoa = new gPessoa("", "", null, 0, "");

      gpessoa.setNomeCompleto();
      gpessoa.setDataNasc();
      gpessoa.setAltura();
      gpessoa.setEmail();

      System.out.println(
            "\n\nNome: " + gpessoa.getNomeCompleto() +
                  "\nData de nascimento: " + gpessoa.formatarDataNasc() +
                  "\nAltura: " + gpessoa.getAltura() + " M" +
                  "\nEmail: " + gpessoa.getEmail());
   }
}
