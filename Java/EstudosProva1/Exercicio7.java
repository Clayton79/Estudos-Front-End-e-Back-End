package Java.EstudosProva1;

public class Exercicio7 {
    public static void main(String[] args) {
        
        int comprimentoDoCampo = 75;
        int alturaDoCampo = 110;

        double areaDoCampo = comprimentoDoCampo * alturaDoCampo;
        double conversaoParaCampos = (2 * 1000000) / areaDoCampo;

        System.out.println("2 km² equivalem a aproximadamente " + conversaoParaCampos +  " campos de futebol.");

    }
}