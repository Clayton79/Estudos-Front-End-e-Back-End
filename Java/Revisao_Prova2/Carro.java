package Java.Revisao_Prova2;

public class Carro extends Veiculo {
    
    private int quantidadeDePortas;

    public Carro(String modelo, int anoFabricacao, double valorDiaria, int quantidadeDePortas) {
        super(modelo, anoFabricacao, valorDiaria);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return this.quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    double calcularValorLocacao(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias devem ser maiores que zero.");
        }
        return dias * valorDiaria;
    }

    
    double calcularValorLocacao(int dias, double desconto) { 
    double total = calcularValorLocacao(dias); 
        return total - desconto;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de Portas: " + quantidadeDePortas);
    }
}