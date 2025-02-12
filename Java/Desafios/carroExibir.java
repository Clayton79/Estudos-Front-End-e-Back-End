package Java.Desafios;

public class carroExibir {
    
    public static void main(String []args) {
        carro carro1 = new carro();

        carro1.marca = "BMW";
        carro1.modelo = "BMW 118i";
        carro1.ano = 2024;

        carro1.exibirInfo();
    }
}