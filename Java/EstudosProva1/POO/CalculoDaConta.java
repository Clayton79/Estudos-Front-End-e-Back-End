package Java.EstudosProva1.POO;

public class CalculoDaConta {
    
    public static void main(String[] args) {
        
        Exercicio2 contaCorrente = new Exercicio2();
        
        contaCorrente.getNumero();
        contaCorrente.getSaldo();
        contaCorrente.getTitular();
        contaCorrente.bloquearConta(false);
        

        contaCorrente.depositar(1200);
        System.out.println("Numero do cliente: " + contaCorrente.getNumero() + " Cliente: " + contaCorrente.getTitular() + " O saldo da conta atual é: " + contaCorrente.getSaldo());
        
        System.out.println(contaCorrente.sacar(3200));
    }
}