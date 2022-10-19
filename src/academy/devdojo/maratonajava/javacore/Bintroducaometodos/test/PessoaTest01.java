package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alessandro");
        pessoa.setIdade(23);

        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
    }
}
/**
 *
 *
 */