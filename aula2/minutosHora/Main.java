package aula2.minutosHora;

import java.util.Scanner;

class Minutos {
    private int minutos;

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    private String hrToMin() {
        int horas = minutos / 60;
        int min = minutos % 60;

        String horaFormat = String.format("%d:%02d", horas, min);

        return horaFormat;
    }

    public String getHrToMin() {
        return hrToMin();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os minutos que deseja converter para horas: ");
        int minutos = scan.nextInt();

        Minutos horasMinutos = new Minutos();

        horasMinutos.setMinutos(minutos);

        String hrFormat = horasMinutos.getHrToMin();

        System.out.println(minutos + " minutos em horas são " + hrFormat + " horas");

        scan.close();
    }
}
