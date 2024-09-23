import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class CadastroProduto {
    private String nome;
    private Date dataFab;
    private Date dataVal;
    private double precoVenda;

    public CadastroProduto(String nome, Date dataFab, Date dataVal, double precoVenda) {
        this.nome = nome;
        this.dataFab = dataFab;
        this.dataVal = dataVal;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");
        nome = scan.nextLine();
    }

    public Date getDataFab() {
        return dataFab;
    }

    public void setDataFab() {
        Scanner scan = new Scanner(System.in);
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print("\n\nInsira a data de FABRICACAO do produto (ddMMyyyy / Somente números): ");
            String dataStr = scan.nextLine();

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
                dataFab = sdf.parse(dataStr);

                if (dataFab.after(new Date())) {
                    System.out.println("Data inválida. A data de fabricação não pode ser posterior à data atual.");
                } else {
                    dataValida = true;
                }
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente.");
            }
        }
    }

    public Date getDataVal() {
        return dataVal;
    }

    public void setDataVal() {
        if (dataFab != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataFab);
            calendar.add(Calendar.MONTH, 1);
            dataVal = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Data de validade definida como: " + sdf.format(dataVal));
        } else {
            System.out.println("Primeiro, defina a data de fabricação.");
        }
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nQual o preço de venda do produto: " + nome);
        precoVenda = scan.nextDouble();
    }
}

public class Produto {
    public static void main(String[] args) {
        CadastroProduto cadastroProd = new CadastroProduto("", null, null, 0.0);

        cadastroProd.setNome();
        cadastroProd.setPrecoVenda();
        cadastroProd.setDataFab();
        cadastroProd.setDataVal();
        
        // Exibir os dados
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome do produto: " + cadastroProd.getNome());
        System.out.println("Data de fabricação: " + sdf.format(cadastroProd.getDataFab()));
        System.out.println("Data de validade: " + sdf.format(cadastroProd.getDataVal()));
        System.out.println("Preço de venda: " + cadastroProd.getPrecoVenda());
    }
}