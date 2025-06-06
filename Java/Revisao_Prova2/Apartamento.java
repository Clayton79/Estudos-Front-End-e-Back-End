package Java.Revisao_Prova2;

public class Apartamento extends Imovel {
    
    private String andar;

    public Apartamento(String endereco,String andar, int anoConstrucao, double valorDiaria) {
        this.endereco = endereco;
        this.andar = andar;
        this.anoConstrucao = anoConstrucao;
        this.valorDiaria = valorDiaria;
    }

    public String getAndar() {
        return this.andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    double calcularValorLocacao(int dias) {
        double valorParaPagar = valorDiaria * dias;
        return valorParaPagar;
    }
}