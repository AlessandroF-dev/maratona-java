package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua tupã");
        Aluno aluno = new Aluno("Alessandro", 23);
        Aluno aluno2 = new Aluno("Albenilia", 24);
        Professor professor = new Professor("Willian Suane", "Java");

        Aluno[] alunosParaSeminario = {aluno, aluno2};
        Seminario seminario = new Seminario("Maratona-java", alunosParaSeminario, local);

        Seminario[] seminarioDisponiveis = {seminario};
        professor.setSeminarios(seminarioDisponiveis);

        professor.imprime();

    }
}
