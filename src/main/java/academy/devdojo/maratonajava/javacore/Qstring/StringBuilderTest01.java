package academy.devdojo.maratonajava.javacore.Qstring;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Alessandro Fernandes";
        nome.concat(" Dev");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Alessandro Fernandes");
        //O valor padrão de inicialização do StringBuilder é 16.
        sb.append(" Dev").append(" master");
        System.out.println(sb);
    }
}
