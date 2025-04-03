package Java.Revisao_Prova;

public class Livro {
    
    private String titulo;
    private int quantidadePaginas;
    private Pessoa autor;  // Agora é do tipo Pessoa

    // Construtor que recebe todos os valores iniciais
    public Livro(String titulo, int quantidadePaginas, Pessoa autor) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
        this.autor = autor;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public int getQuantidadePaginas() {
        return this.quantidadePaginas;
    }

    public Pessoa getAutor() {
        return this.autor;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    // Método para exibir as informações do livro, incluindo o autor
    public void exibirLivro() {
        System.out.println("Título: " + this.titulo +
                           "\nQuantidade de Páginas: " + this.quantidadePaginas +
                           "\nAutor: " + this.autor.getNome() + " " + this.autor.getSobrenome() +
                           "\nIdade do Autor: " + this.autor.getIdade());
    }
}
