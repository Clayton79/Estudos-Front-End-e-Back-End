package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanto é o custo do KW na sua cidade ? ");
        double custoDoKW = scanner.nextDouble();

        System.out.println("Qual foi o seu consumo mensal de KWH ? ");
        double consumoMensal = scanner.nextDouble();

        double custoTotal = custoDoKW * consumoMensal;

        System.out.println("O custo total desse mês é de R$" + custoTotal);

        scanner.close();
    }
}