package Java.EstudosProva1.POO;

public class Exercicio1 {
    
    private double valor;

    // Método para zerar o contador
    public void zerar() {
        valor = 0;
    }

    // Método para incrementar o contador
    public void incrementar() {
        valor++; // Agora incrementa corretamente
    }

    // Método para obter o valor atual do contador
    public double getValor() {
        return valor;
    }
}