package Java;

public class EstruturaDeControles {
    public static void main (String[] args) {
        
        // if - else (condicionais)
        
        // operadores de comparação
        // x > y, a == b
        
        int idade = 18;

        // if -> começa a condição
        // () -> contem a condição a ser avaliada
        // {} -> corpo da condição
        if(idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
        
        // if -> validar se algo é verdadeiro.
        // else -> executa se o if não executar.

        double nota = 6.3;

        if(nota > 7) {
            System.out.println("Você passou de ano.");
        } else {
            System.out.println("Você está de recuperação.");
        }

        // else if -> intermediario do if e else
        // e ele valida um bloco também.

        int hora = 14;

        if(hora < 12) {
            System.out.println("Bom dia !");

        } else if(hora < 18) {
            
            System.out.println("Boa tarde !");
        } else {
            System.out.println("Boa noite !");
        }

        // eu posso ter 1 ou mais else if 

        // 2 - Operadores de comparação
        int x = 10;
        int y = 5;

        // = é diferente de ==
        // = é atribuição
        // == é comparação

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        boolean o = true;

        if(o) {
            System.out.println("é verdadeiro");
        }

        // Operadores lógicos

        // && => AND => op1 && op2 => boolean => apenas se as op. forem true
        // || => OR => op1 || op2 => boolean => se alguma op. for true
        // ! => NOT => !valor => altera o valor para o contrario => TRUE <> FALSE

        boolean temDinheiro = true;
        boolean temTempo = false;

        if(temDinheiro && temTempo) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Não pode viajar");
        }

        // LOOPS - While e For
        // FOCO em FOR
        // Repetir algo até uma condição ser atingida
        // Evitar repetição mecanica de código (ela vira automatica)
        int contador = 1;

        while(contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // se eu não tenho uma condição de encerramento de loop
        // eu caio num loop infinito

        // iteração = cada passagem pela estrutura do loop

        for(int i = 1; i <= 5; i++) {
            System.out.println("valor de i é " + i);
        }

        // exemplos práticos

        //analise numerica
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 

        int somaPar = 0;
        int somaImpar = 0;

        for(int num : numeros) {
            
            if(num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }

            // identificar se um numero é multiplo de 3 
            if(num % 3 == 0) {
                System.out.println("O numero " + num + " é multiplo de 3");
            }

            if(num > 5 && num < 7) {
                System.out.println("O número está entre 5 e 7, " + num);
            }
        }

        System.out.println("Soma pares: " + somaPar);
        System.out.println("Soma ímpares: " + somaImpar);

        // break => ejetar o loop
        // continue => pular uma execução
        
        //vars temporarios dos loops, elas podem repetir o nome
        for(int i = 1; i <= 10; i++) {

            if(i == 2) {
                continue;
            }

            if(i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}