package HERANCA_1;

// Classe base para cadastro de qualquer entidade com atributos comuns nome e endereço
class CadastroBase {
    private String nome;
    private String endereco;

    // Construtor que inicializa nome e endereço
    public CadastroBase(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getter e setter para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para o atributo 'endereco'
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

// Classe que representa uma Pessoa Física, derivada de CadastroBase
class PessoaFisica extends CadastroBase {
    private String cpf;
    private String email;

    // Construtor que inicializa nome, endereço, CPF e email
    public PessoaFisica(String nome, String endereco, String cpf, String email) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cpf = Util.formatarCpf(cpf); // CPF é formatado ao ser definido
        this.email = email;
    }

    // Métodos getter e setter para o atributo 'cpf'
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Util.formatarCpf(cpf); // Formata CPF ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Classe que representa uma Pessoa Jurídica, derivada de CadastroBase
class PessoaJuridica extends CadastroBase {
    private String cnpj;
    private String email;

    // Construtor que inicializa nome, endereço, CNPJ e email
    public PessoaJuridica(String nome, String endereco, String cnpj, String email) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cnpj = Util.formatarCnpj(cnpj); // CNPJ é formatado ao ser definido
        this.email = email;
    }

    // Métodos getter e setter para o atributo 'cnpj'
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = Util.formatarCnpj(cnpj); // Formata CNPJ ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Classe que representa um Funcionário, derivada de CadastroBase
class Funcionario extends CadastroBase {
    private String cpf;
    private double salario;

    // Construtor que inicializa nome, endereço, CPF e salário
    public Funcionario(String nome, String endereco, String cpf, double salario) {
        super(nome, endereco); // Chama o construtor da classe base
        this.cpf = Util.formatarCpf(cpf); // CPF é formatado ao ser definido
        this.salario = salario;
    }

    // Métodos getter e setter para o atributo 'cpf'
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Util.formatarCpf(cpf); // Formata CPF ao ser atualizado
    }

    // Métodos getter e setter para o atributo 'salario'
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Classe utilitária para formatação de CPF e CNPJ
class Util {
    // Método estático para formatar CPF (ex: 12345678900 -> 123.456.789-00)
    public static String formatarCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // Remove todos os caracteres não numéricos
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos.");
        }
        // Aplica a máscara de formatação
        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    // Método estático para formatar CNPJ (ex: 12345678000199 -> 12.345.678/0001-99)
    public static String formatarCnpj(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", ""); // Remove todos os caracteres não numéricos
        if (cnpj.length() != 14) {
            throw new IllegalArgumentException("CNPJ deve ter 14 dígitos.");
        }
        // Aplica a máscara de formatação
        return cnpj.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
    }
}

// Classe principal que simula a execução do programa
public class Empresa {
    public static void main(String[] args) {

        // Criação de objetos do tipo Pessoa Física
        PessoaFisica pf1 = new PessoaFisica("Joao Silva", "Rua A, 123", "12345678900", "joao.silva@gmail.com");
        PessoaFisica pf2 = new PessoaFisica("Mariana Costa", "Rua B, 456", "45678912300", "mariana.costa@gmail.com");
        PessoaFisica pf3 = new PessoaFisica("Roberto Brandao", "Rua C, 789", "78945612300",
                "roberto.brandao@gmail.com");

        // Criação de objetos do tipo Pessoa Jurídica
        PessoaJuridica emp1 = new PessoaJuridica("Tech Corp", "Av. Industrial, 456", "12345678000199",
                "contato@techcorp.com");
        PessoaJuridica emp2 = new PessoaJuridica("Peps Coke", "Av. Soda, 123", "90123456000177",
                "contato@pepscoke.com");
        PessoaJuridica emp3 = new PessoaJuridica("From Hardware", "Av. Steem, 789", "89012345000166",
                "contato@fromhardware.com");

        // Criação de objetos do tipo Funcionario
        Funcionario func1 = new Funcionario("Maria Souza", "Rua A, 123", "98765432100", 3500.00);
        Funcionario func2 = new Funcionario("Leonardo Fonceca", "Rua B, 456", "12345678900", 3500.00);
        Funcionario func3 = new Funcionario("Roberta Ferreira", "Rua C, 789", "45678912300", 3500.00);

        // Impressão das informações de Pessoa Física
        System.out.println("\n\nPessoa Fisica: " + pf1.getNome() + "\nEndereco: " + pf1.getEndereco() + "\nCPF: "
                + pf1.getCpf() + "\nE-mail: " + pf1.getEmail());

        System.out.println("\n\nPessoa Fisica: " + pf2.getNome() + "\nEndereco: " + pf2.getEndereco() + "\nCPF: "
                + pf2.getCpf() + "\nE-mail: " + pf2.getEmail());

        System.out.println("\n\nPessoa Fisica: " + pf3.getNome() + "\nEndereco: " + pf3.getEndereco() + "\nCPF: "
                + pf3.getCpf() + "\nE-mail: " + pf3.getEmail());

        System.out.println("\n\n##########################################################");

        // Impressão das informações de Pessoa Jurídica
        System.out.println("\n\nPessoa Juridica: " + emp1.getNome() + "\nEndereco: " + emp1.getEndereco() + "\nCNPJ: "
                + emp1.getCnpj() + "\nE-mail: " + emp1.getEmail());

        System.out.println("\n\nPessoa Juridica: " + emp2.getNome() + "\nEndereco: " + emp2.getEndereco() + "\nCNPJ: "
                + emp2.getCnpj() + "\nE-mail: " + emp2.getEmail());

        System.out.println("\n\nPessoa Juridica: " + emp3.getNome() + "\nEndereco: " + emp3.getEndereco() + "\nCNPJ: "
                + emp3.getCnpj() + "\nE-mail: " + emp3.getEmail());

        System.out.println("\n\n##########################################################");

        // Impressão das informações de Funcionários
        System.out.println("\n\nFuncionario: " + func1.getNome() + "\nEndereco: " + func1.getEndereco() + "\nCPF: "
                + func1.getCpf() + "\nSalário: " + func1.getSalario());

        System.out.println("\n\nFuncionario: " + func2.getNome() + "\nEndereco: " + func2.getEndereco() + "\nCPF: "
                + func2.getCpf() + "\nSalário: " + func2.getSalario());

        System.out.println("\n\nFuncionario: " + func3.getNome() + "\nEndereco: " + func3.getEndereco() + "\nCPF: "
                + func3.getCpf() + "\nSalário: " + func3.getSalario());
    }
}
