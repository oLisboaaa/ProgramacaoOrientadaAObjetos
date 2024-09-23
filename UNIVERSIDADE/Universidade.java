class Aluno {
    // Atributos privados para proteger os dados do aluno
    private String nomeComp;
    private String ra;
    private String curso;

    // Construtor para inicializar os atributos do aluno
    public Aluno(String nomeComp, String ra, String curso) {
        this.nomeComp = nomeComp;
        this.ra = ra;
        this.curso = curso;
    }

    // Método que retorna as informações do aluno formatadas
    public String getFicha() {
        return "Nome: " + nomeComp +
               "\nRA: " + ra +
               "\nCurso: " + curso + "\n";
    }
}

class Notas {
    // Atributos privados para gerenciar as notas e a situação do aluno
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaFinal;
    private int avaliacao;
    private int presenca;
    private String reprov;

    // Construtor que inicializa as notas e calcula a situação
    public Notas(double nota1, double nota2, double nota3, double nota4, int avaliacao, int presenca) {
        // Validação de notas e presença
        if (validarNotas(nota1, nota2, nota3, nota4) && validarPresenca(presenca)) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
            this.avaliacao = avaliacao;
            this.presenca = presenca;
            this.notaFinal = calcularNotaFinal(); // Calcula a nota final
            this.reprov = definirSituacao(); // Define a situação do aluno
        } else {
            throw new IllegalArgumentException("Notas ou presença inválidas."); // Lança exceção em caso de dados inválidos
        }
    }

    // Método privado que calcula a nota final com base na avaliação
    private double calcularNotaFinal() {
        switch (avaliacao) {
            case 2:
                return (nota1 + nota2) / 2; // Média simples
            case 3:
                double peso1 = 10.0 / 7.0;
                double peso2 = 20.0 / 7.0;
                double peso3 = 40.0 / 7.0;
                return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3); // Média ponderada
            case 4:
                return (nota1 * 0.15) + (nota2 * 0.30) + (nota3 * 0.10) + (nota4 * 0.45); // Média ponderada com diferentes pesos
            default:
                throw new IllegalArgumentException("Número de avaliações inválido!"); // Lança exceção para avaliação inválida
        }
    }

    // Método que define a situação do aluno com base na nota final e presença
    private String definirSituacao() {
        if (notaFinal < 5) {
            return "Sua nota foi de " + notaFinal + ". Você está REPROVADO."; // Reprovado por nota
        } else if (presenca < 75) {
            return "Sua nota foi de " + notaFinal + ", mas sua presença ficou em " + presenca + "%. Você está REPROVADO."; // Reprovado por falta
        } else {
            return "Sua nota foi de " + notaFinal + ". Você está APROVADO."; // Aprovado
        }
    }

    // Métodos de validação para as notas e presença
    private boolean validarNotas(double... notas) {
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                return false; // Verifica se as notas estão entre 0 e 10
            }
        }
        return true; // Todas as notas são válidas
    }

    private boolean validarPresenca(int presenca) {
        return presenca >= 0 && presenca <= 100; // Verifica se a presença está entre 0% e 100%
    }

    // Método para obter a situação de reprovação
    public String getReprov() {
        return reprov;
    }
}

public class Universidade {
    public static void main(String[] args) {
        try {
            // Criação de um objeto Aluno com dados específicos
            Aluno aluno = new Aluno("Marcelo Lisboa", "248347", "ADS");
            // Criação de um objeto Notas com notas e dados de avaliação
            Notas notas = new Notas(8.0, 7.5, 5.0, 9.0, 4, 66);
            // Impressão da ficha do aluno e da situação final
            System.out.println(aluno.getFicha() + notas.getReprov() + "\n");
        } catch (IllegalArgumentException e) {
            // Captura e exibe erros de validação
            System.err.println("Erro: " + e.getMessage());
        }
    }
}