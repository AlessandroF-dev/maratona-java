package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, username, email);
        }
    }
}
