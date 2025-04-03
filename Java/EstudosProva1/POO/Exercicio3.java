package Java.EstudosProva1.POO;

public class Exercicio3 {
    
    private String matricula;
    private String nome;
    private String curso;
    private double[] notas;

    // Construtor
    public Exercicio3(String matricula, String nome, String curso, int quantidadeNotas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notas = new double[quantidadeNotas]; // Vetor fixo com o número de notas
    }

    // Getters
    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public double[] getNotas() {
        return this.notas;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método para adicionar notas
    public void adicionarNotas(double[] adicionar) {
        if (adicionar.length == this.notas.length) {
            this.notas = adicionar;
        } else {
            System.out.println("Erro: Número de notas inválido.");
        }
    }

    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / this.notas.length;
    }

    // Método para verificar se o aluno está aprovado
    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}