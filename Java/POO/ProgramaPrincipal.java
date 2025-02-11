package Java.POO;

public class ProgramaPrincipal {
    
    public static void main (String[] args) {
        
        // Criar uma pessoa => instanciar
        // tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Matheus");
        pessoa1.setIdade(33);
        pessoa1.setPeso(80.5);
        pessoa1.setAltura(1.78);

        System.out.println(pessoa1.getNome() + " " + pessoa1.getIdade() + " " + pessoa1.getAltura() + " " + pessoa1.getPeso());

        Pessoa pessoa2 = new Pessoa("Maria", 44, 1.70, 68);

        System.out.println(pessoa2.getNome());

        System.out.println(pessoa2.calcularImc());

        System.out.println(pessoa2.classificaoDeImc());
        
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }
}