package aula2.minutosHora;

import java.util.Scanner;

// definição dos parametros da classe Minutos
class Minutos {
    private int minutos;

    // Constructor da classe
    public Minutos(int minutos) {
        this.minutos = minutos;
    }

    // metodo que converte os minutos em horas
    //de forma q não fique formatado tipo "2,5 hrs"
    private String hrToMin() {
        int horas = minutos / 60;
        int min = minutos % 60;

        String horaFormat = String.format(horas+":"+min);

        return horaFormat;
    }

    // metodo para puxar as horas formatadas
    public String getHrToMin() {
        return hrToMin();
    }
}

public class MinToHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os minutos que deseja converter para horas: ");
        int minutos = scan.nextInt();

        // objeto para puxar o contructor da classe
        Minutos horasMinutos = new Minutos(minutos);

        //variavel para puxar o metodo formatador
        String hrFormat = horasMinutos.getHrToMin();

        System.out.println(minutos + " minutos em horas são " + hrFormat + " horas");

        scan.close();
    }
}
