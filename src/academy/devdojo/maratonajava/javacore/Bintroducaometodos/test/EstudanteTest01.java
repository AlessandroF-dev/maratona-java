package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Ale";
        estudante1.idade = 22;
        estudante1.sexo = 'm';

        estudante2.nome = "Be";
        estudante2.idade = 24;
        estudante2.sexo = 'f';

        impressora.imprime(estudante2);
        impressora.imprime(estudante1);
    }
}
