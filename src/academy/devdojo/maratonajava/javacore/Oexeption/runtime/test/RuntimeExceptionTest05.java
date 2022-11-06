package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException () throws SQLException, FileNotFoundException{

    }
}
/** - Para organizar melhor a utilização do multi cathcs, podemos utilizar a sintaxe do java, que diz que
 * podemos colocar exceções que NÃO ESTÃO NA MESMA LINHA DE HERANÇA dentro de um mesmo
 * catch separados por um pipe "|"
 * EX: try {
 *             talvezLanceException();
 *         }catch (SQLException | FileNotFoundException e) {
 *             e.printStackTrace();
 *         }
 *     }
 *     private static void talvezLanceException () throws SQLException, FileNotFoundException{
 *
 *     }
 * */