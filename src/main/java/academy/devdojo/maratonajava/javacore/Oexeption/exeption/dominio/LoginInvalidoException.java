package academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
