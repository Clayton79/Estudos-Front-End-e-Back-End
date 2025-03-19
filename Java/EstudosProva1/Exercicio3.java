package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o comprimento do térreno: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Insira a altura do térreno: ");
        double altura = scanner.nextDouble(); 

        double area = comprimento * altura;

        System.out.println("A aréa do térreno é = " + area + " m2 ");

        scanner.close();
    }
}