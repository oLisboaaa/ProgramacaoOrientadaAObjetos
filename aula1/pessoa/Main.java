package aula1.pessoa;

import java.text.ParseException; // Importa a classe para lidar com erros de análise de data
import java.text.SimpleDateFormat; // Importa a classe para formatação e análise de datas
import java.util.Date; // Importa a classe para representar a data e hora
import java.util.Scanner; // Importa a classe para leitura de entrada do usuário

// Define a classe Pessoa
class Pessoa {
    String nome;        // Armazena o nome da pessoa
    String sobrenome;   // Armazena o sobrenome da pessoa
    String dataNasc;    // Armazena a data de nascimento formatada
    String CPF;         // Armazena o CPF formatado
    String email;       // Armazena o e-mail da pessoa
    String userEmail;   // Armazena o e-mail base (nome.sobrenome)

    // Construtor da classe Pessoa
    public Pessoa(String nome, String sobrenome, String dataNasc, String CPF) {
        this.nome = nome; // Inicializa o nome
        this.sobrenome = sobrenome; // Inicializa o sobrenome
        this.dataNasc = formatarData(dataNasc); // Formata a data de nascimento
        this.CPF = formatarCPF(CPF); // Formata o CPF
        this.userEmail = nome + "." + sobrenome; // Cria o e-mail base
        this.email = gerarEmail(userEmail); // Gera o e-mail completo
    }

    // Gera o e-mail completo usando o e-mail base
    private String gerarEmail(String userEmail) {
        String dominio = "facens.br"; // Domínio fixo para o e-mail
        return userEmail.toLowerCase() + "@" + dominio; // Retorna o e-mail completo em minúsculas
    }

    // Formata a data de nascimento
    private String formatarData(String data) {
        try {
            // Define o formato original da data (sem barras)
            SimpleDateFormat formatoOriginal = new SimpleDateFormat("ddMMyyyy");
            // Define o formato desejado para a data (com palavras por extenso)
            SimpleDateFormat formatoDesejado = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
            // Converte a string da data para um objeto Date
            Date dataObj = formatoOriginal.parse(data);
            // Formata o objeto Date no formato desejado
            return formatoDesejado.format(dataObj);
        } catch (ParseException e) {
            return "Data inválida"; // Retorna uma mensagem de erro se a data for inválida
        }
    }

    // Formata o CPF
    private String formatarCPF(String cpf) {
        // Remove todos os caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() == 11) {
            // Formata o CPF com pontos e hífen
            return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
        } else {
            return "CPF inválido"; // Retorna uma mensagem de erro se o CPF for inválido
        }
    }
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Insira o nome do usuário: "); // Solicita o nome do usuário
        String nome = scan.nextLine(); // Lê o nome do usuário

        System.out.print("Insira o sobrenome do usuário: "); // Solicita o sobrenome do usuário
        String sobrenome = scan.nextLine(); // Lê o sobrenome do usuário

        System.out.print("Insira a data de nascimento do usuário (ddMMyyyy / Somente números): "); // Solicita a data de nascimento
        String dataNasc = scan.nextLine(); // Lê a data de nascimento

        System.out.print("Insira o CPF do usuário (somente números): "); // Solicita o CPF
        String CPF = scan.nextLine(); // Lê o CPF

        // Cria uma instância da classe Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, sobrenome, dataNasc, CPF);

        // Exibe as informações da pessoa
        System.out.println("\nNome: " + nome + " " + sobrenome +"\nData de nascimento: " + pessoa.dataNasc +"\nCPF: " + pessoa.CPF +"\nE-mail: " + pessoa.email);

        scan.close(); // Fecha o Scanner
    }
}
