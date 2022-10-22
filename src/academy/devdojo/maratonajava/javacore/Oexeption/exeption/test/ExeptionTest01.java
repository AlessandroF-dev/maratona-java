package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo (){
        File file = new File("arquivo.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*** 95 - Exceções pt 01 - Errors
 *
 * - A stack é uma porção contígua de memória reservada para empilhar os dados
 * necessários durante a execução de blocos de código.
 *
 * - "Runtime exeption" é uma exceção do tipo Unchecked, que geralmente
 * quando acontece é um erro de desenvolvimento, onde o dev deveria
 * ter tomado cuidado ao executar a chamada que esta dando a exceção
 *
 * -
 */
