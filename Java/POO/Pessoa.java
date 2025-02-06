package Java.POO;

// Novos objetos para poder fazer ações no programa com eles
// Interação entre objetos

// Classe -> objeto
// Molde do objeto = classe
// Cria um novo objeto = instancia

public class Pessoa {
    
    // Atributos = caracteristicas
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }
    
    // Métodos -> ações
    // setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
