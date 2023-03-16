package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Caio");
        Professor professor2 = new Professor("DevDojo");

        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Back-end-java", professores);

        escola.imprime();
    }
}
