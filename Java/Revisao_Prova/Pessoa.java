package Java.Revisao_Prova;

public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;

    // Construtor que recebe os valores iniciais dos atributos
    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public int getIdade() {
        return this.idade;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacao() {
        System.out.println("Nome: " + this.nome + ", Sobrenome: " + this.sobrenome + ", Idade: " + this.idade);
    }
}