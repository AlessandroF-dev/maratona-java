package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person  build = new Person.PersonBuilder()
                .withFirstName("Alessandro")
                .withLastName("Fernandes")
                .withUsername("AlessandroF-dev")
                .withEmail("alessandro@teste@gmail.com")
                .build();

        System.out.println(build);
    }
}
