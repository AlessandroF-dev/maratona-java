package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
    }
}
/**
 * Exceções Checked - são aquelas no qual você é obrigado a tratá-la, seja com um bloco try-catch ou mesmo com um throws
 * (relançando a mesma para outro local).
 * <p>
 * Exceções Unchecked - não é obrigatório o tratamento da mesma, você pode tratar apenas se quiser, se sentir que é
 * necessário para o bom funcionamento da sua aplicação
 * <p>
 * - Quando queremoslançar exceções utilizamos throw + new + objeto que desejamos + mensagem.
 * Que geralmente throw new é utilizado quando temos uma exceção do tipo runtime, não sendo necessário
 * colocar na assinatura do método um aviso (avisando que uma exceção esta sendo lançada)
 * <p>
 * TRY - É utilizado para tratar os possíveis problemas (exceções). Caso os comandos
 * do try sejam executados e não houver erro, ele prossegue com a execução dos programas.
 * Já se não obter sucesso ele irá entrar no catch, para executar as instruções em caso de falha
 * no try.
 * BLOCO TRY É CHAMADO DE BLOCO PROTEGIDO, POIS CASO OCORRA ALGUM ERRO DENTRO DO BLOCO
 * A EXECUÇÃO DESVIARÁ PARA OS BLOCOS DO CATCH.
 * <p>
 * CATCH - Catch é seguida por uma declaração do tipo de exceção sendo lançada (catch (Exception e).)
 *      Também podemos utilizar mais de um catch para códigos onde houver mais de uma exceção
 * CATCH SÓ SERA EXECUTADO SE UM ERRO ACONTECER DENTRO DO BLOCO TRY.
 * <p>
 * FINALLY - É o comando que associa o bloco de código que irá executar caso a exaceção ocorra
 * ou não, ou seja sempre é executado.
 * GERALMENTE E UTILIZADO PARA ALOCAR UM CÓDIGO IMPORTANTE, POIS SERA EXECUTADO CASO A EXCEÇÃO SEJA TRATADA
 * OU NÃO
 */