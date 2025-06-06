package Java.Revisao_Prova2;

abstract class Imovel {
    
    protected String endereco;
    protected int anoConstrucao;
    protected double valorDiaria;

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoConstrucao() {
        return this.anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }
    
    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    abstract double calcularValorLocacao(int dias);
}
