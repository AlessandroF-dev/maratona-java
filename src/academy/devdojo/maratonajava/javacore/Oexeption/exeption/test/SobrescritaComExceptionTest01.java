package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
    }
}
}
