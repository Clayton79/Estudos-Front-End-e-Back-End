package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = scanner.nextInt();
        
        if(num1 > 1) {
            System.out.println("O número digitado é positivo.");
        } else if(num1 < 0) {
            System.out.println("O número digitado é negativo.");
        }

        scanner.close();
    }
}