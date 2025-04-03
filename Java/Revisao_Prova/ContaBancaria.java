package Java.Revisao_Prova;

public class ContaBancaria {
    
    private double saldo;
    
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Realizado.");
        }else {
            System.out.println("Saldo Insuficiente.");
        }
    }
}