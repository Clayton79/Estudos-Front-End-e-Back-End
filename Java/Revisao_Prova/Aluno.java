package Java.Revisao_Prova;

public class Aluno {
    // Atributos privados
    private int matricula;
    private String nome;
    private String curso;
    private double[] notas;
    private int indice = 0; // controla a posição para adicionar a próxima nota

    // Construtor para inicializar os atributos
    public Aluno(int matricula, String nome, String curso, int tamanhoNotas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notas = new double[tamanhoNotas];
    }

    // Método para adicionar uma nota
    public void adicionarNota(double nota) {
        if (indice < notas.length) {
            notas[indice++] = nota;
        }
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < indice; i++) {
            soma += notas[i];
        }
        return soma / indice;
    }

    // Método para verificar se o aluno está aprovado (média >= 7)
    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }
}