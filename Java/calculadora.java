package Java;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Exibir todas as opções para o usuario
        // e pedir para ele escolher
        int opcao;

        do{
            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            opcao =  scanner.nextInt();

            if(opcao >= 1 && opcao <= 4) {
                
            }
            
        }while(opcao != 0);
    }
}