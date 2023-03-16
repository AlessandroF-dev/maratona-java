package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar () throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Ale";
        String senhaDB = "1234";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
/** 104 - Exceções pt 10 - Exceção customizada
 *
 * - Vimos que o Java possuí vários tipos de exceções, porém em alguns casos poderá preciso
 * exceções que o não estão incluidas no meio dessas. Sendo assim conseguimos criar exceções
 * customizadas, conforme o sua regra de negócio, para isso cria-se uma classe com o nome da exceção e por padrão o nome da classe
 * deve terminar com "Exception".
 */