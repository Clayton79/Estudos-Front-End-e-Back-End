package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        int a = scanner.nextInt();

        System.out.println("Digite o coeficiente b: ");
        int b = scanner.nextInt();

        System.out.println("Digite o coeficiente c: ");
        int c = scanner.nextInt();

        double delta = (Math.pow(b,2)) - (4 * a * c); 
                    //(b * b) também está correto.

        System.out.println("O delta da equação é = " + delta);

        scanner.close();
    }
}