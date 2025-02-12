package Java.Desafios;

public class contaBancaria {
    
    String titular;
    double saldo;

    public double depositar() {
        return saldo++; 
    }

    public double sacar() {
        return saldo--;
    }
    
    public void exibirSaldo() {
        System.out.println("O saldo atual é " + saldo);
    }
   
}