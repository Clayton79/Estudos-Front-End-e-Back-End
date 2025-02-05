package Java;

public class SintaxeBasica {
    
    public static void main(String[] args) {

        // 1 - Impressão de texto.
        System.out.println("Podemos imprimir isto aqui, e numeros também " + 45);

        // 2 - tipos primitivos
        // variavel = coloca dados
        // int = interger = inteiro
        int idade = 25;
        int anoAtual = 2025;
        
        System.out.println("Sua idade é :" + idade + " anos.");
        System.out.println("O ano é :" + anoAtual);

        // ling prog => ingles
        // ,(BR) => .(EN)
        double altura = 1.79;
        double pi = 3.14;

        System.out.println("Altura" + altura + " PI " + pi);

        // Textos = Strings
        String nome = "Matheus";

        System.out.println("O Nome é: " + nome);

        // boolean => true ou false
        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("Está logado ? " + estaLogado);

        System.out.println("Acesso: " + temAcesso);

        // Variáveis
        int numero;

        numero = 10;
        
        System.out.println(numero);

        numero = 15;

        System.out.println(numero);

        // A atribuição precisa ser do mesmo tipo declarado.
        // numero = "teste";

        int x = 10, y = 11, z = 12;

        System.out.println(x + " " + y + " " + z);

        // 4 - Operadores básicos.
        // aritméticas.
        int a = 10;
        int b = 3;

        // () => resolvido primeiro.
        // subtracao -> exibicao.
        System.out.println("A - B = " + (a - b));
        System.out.println("A + B = " + (a + b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A * B = " + (a * b));

        double c = 10;
        double d = 3;

        System.out.println("C / D = " + (c / d));
        // op. inc e decremento
        int contador = 0;

        contador++;
        
        System.out.println("VALOR CONTADOR: " + contador);

        contador--;
        contador--;
        contador--;

        System.out.println("VALOR CONTADOR: " + contador);
        
        //op. composto
        // a = 10 
        // a = a + 5
        // a += 5 

        System.out.println("OP COMPOSTO SOMA: " + (a += 5));
        System.out.println("OP COMPOSTO SUBTRACAO: " + (b -= 15));
        System.out.println("OP COMPOSTO MULTIPLICACAO: " + (a *= 5));

    }

}