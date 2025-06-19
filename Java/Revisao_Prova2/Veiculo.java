package Java.Revisao_Prova2;

abstract class Veiculo  {

    protected String modelo;
    protected int anoFabricacao;
    protected double valorDiaria;

    public Veiculo(String modelo, int anoFabricacao, double valorDiaria) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    abstract double calcularValorLocacao(int dias);

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Valor da Diária: " + valorDiaria);
    }
}