package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
// \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.+([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Email válido ?");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        System.out.println("texto:  " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n");
        }
    }
}

/**  Regex - Pattern e Matcher
 * Como encontrar todos os padrões de emails válidos dentro do texto.
 *
 * ```
 * String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br,
 * teste@gmail.com, sakura@mail ";
 *
 * // filtramos de a-z A-Z 0-9 caracteres como . _ - utilizamos contra barra 2x para poder filtrar
 * String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.+([a-zA-Z])+)+";
 * System.out.println("#@!zoro@mail.br".matches(regex));
 * ```
 * */