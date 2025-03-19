package Java.EstudosProva1;

import java.util.Scanner;

public class Exercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = scanner.nextInt();
        
        double conversaoParaCelsius = 5 * ((tempF - 32) / 9);

        System.out.println("A temperatura em Fahrenheit para graus Celsius é de " + conversaoParaCelsius + "°C.");

        scanner.close();
    }
}