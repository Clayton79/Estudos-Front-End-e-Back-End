package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora ?");
        double ganhoPorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalha por mês ?");
        int horasTrabalhadas = scanner.nextInt();

        double salarioDoMes = ganhoPorHora * horasTrabalhadas;

        System.out.println("O salario do seu referido mês é de R$" + salarioDoMes );

        scanner.close();
    }
}