package Java.Desafios;

public class contaBancariaExibir {
    
    public static void main(String []args) {
        
        contaBancaria conta1 = new contaBancaria();
        
        conta1.titular = "Reinan";
        conta1.saldo = 0;

        conta1.sacar();
        
        conta1.exibirSaldo();
        
    }
}