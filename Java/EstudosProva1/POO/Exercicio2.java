package Java.EstudosProva1.POO;

public class Exercicio2 {
    
    private double numero;
    private double saldo;
    private String titular;
    private boolean bloqueada;

    public Exercicio2() {
        this.numero = 69;
        this.saldo = 1234.0;
        this.titular = "Reinan";
        this.bloqueada = false;
    }

    public double getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double depositar(double deposito) {
        if(!this.bloqueada) {
            return this.saldo = this.saldo + deposito;
        }else {
            return this.saldo;
        }
        
    }

    // public double sacar(double saque) {
    //     if(this.saldo > saque) {
    //     this.saldo = this.saldo - saque;
    //     }else {
    //     this.saldo
    //     }
    //     return this.saldo;
    // }

    public String sacar(double saque) {
        String msg;

        if(!this.bloqueada) {
            if(this.saldo > saque) {
                this.saldo = this.saldo - saque;
                msg = "Saldo suficiente. Seu saldo depois do saque é :" + this.saldo;
            }else {
                msg = "Saldo insuficiente. Seu saldo é :" + this.saldo + "menor que o saque" + saque;
            }
        }else {
        msg = "Conta Bloqueada.";
        }

        return msg;
    }

    public boolean bloquearConta(boolean bloquear) {
        return this.bloqueada = bloquear;
    }
}