package Java.POO;

public class ProgramaPrincipal {
    
    public static void main (String[] args) {
        
        // Criar uma pessoa => instanciar
        // tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Matheus");

        System.out.println(pessoa1.getNome());
    }
}
