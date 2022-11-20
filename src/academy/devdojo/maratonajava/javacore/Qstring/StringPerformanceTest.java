package academy.devdojo.maratonajava.javacore.Qstring;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0,01, 02,03
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
/** 111 - Classes Utilitárias - Strings pt 04 - StringBuilder
 *
 * - A classe StrinBuilder faz parte do pacote do java.lang. Essa classe nos permite
 * criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis
 * de String modificáveis.
 *
 *- Características StringBuilder
 * Armazena caracteres especificados pela sua capacidade, caso ela seja excedida,
 * é aumentada para acomodar os caracteres adicionais;
 * Não precisa alocar novos objetos quando realiza uma concatenação;
 * Não são sincronizadas;
 * Não são seguras para threads;
 * Uma vantagem sobre a classe String é a concatenação de strings. Pois quando concatena
 * strings com StringBuilder é invocado o método append. Esse método aloca novas strings
 * concatenadas para o mesmo objeto, ou seja, cada vez que concatena strings não são
 * criadas cópias dos objetos como é realizado pelo método concat da classe String,
 * contribuindo para um melhor desempenho do sistema.
 *
 * Fonte (https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609)
 *
 * - StringBuilder vs StringBuffer:
 *
 * Ambos são bem mais rápidos para concatenação de valores do que a String comum e fazem
 * exatamente a mesma função. A principal diferença é que o StringBuffer é sincronizado,
 * enquanto que o outro não. Assim, você garante a consistência do seu código quando há
 * diversas threads lendo ou modificando a mesma String. Para esses casos, o ideal é
 * usar o StringBuffer. Porém o StringBuilder ainda é mais rápido do que o StringBuffer.
 *
 * Fonte (https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865)
 * */