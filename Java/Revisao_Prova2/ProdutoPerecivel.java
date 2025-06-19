package Java.Revisao_Prova2;

public class ProdutoPerecivel extends Produto {
        
        private String dataDeValidade;

        public void exibirDetalhesProduto() {
            System.out.println("Nome: " + nome + "Preço: " + preco + "Código: " + codigo + "Data de Validade: " + dataDeValidade);
        }
}