package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo () throws IOException{
        File file = new File("arquivo.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    /**
     * Exceções Checked - são aquelas no qual você é obrigado a tratá-la, seja com um bloco try-catch ou mesmo com um throws
     * (relançando a mesma para outro local).
     *
     * Exceções Unchecked - não é obrigatório o tratamento da mesma, você pode tratar apenas se quiser, se sentir que é
     * necessário para o bom funcionamento da sua aplicação
     *
     *- Quando queremoslançar exceções utilizamos throw + new + objeto que desejamos + mensagem.
     * Que geralmente throw new é utilizado quando temos uma exceção do tipo runtime, não sendo necessário
     * colocar na assinatura do método um aviso (avisando que uma exceção esta sendo lançada)
     *
     * @param a
     * @param g não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
}
