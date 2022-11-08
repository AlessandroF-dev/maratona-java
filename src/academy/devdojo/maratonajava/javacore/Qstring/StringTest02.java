package academy.devdojo.maratonajava.javacore.Qstring;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Alessandro";
        String numeros = "012345";
        System.out.println(nome.charAt(6));
        System.out.println(nome.length());
        System.out.println(nome.replace("A", "E"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim());
    }
}

/** 109 - Classes Utilitárias - Strings pt 02
 *
 * - O método charAt de "String" retorna o char baseado no indice (sendo que o indice começa em 0)Ex:
 * - O método length de "String" retorna tamanho da String.
 * - O método replace de "String" todos os caracteres da primeira posição pelo desejado.
 * - O método toLowerCase de "String" faz com que todos os caracteres da String se tornem lowerCase.
 * - O método toUpperCase de "String" faz com que todos os caracteres da String se tornem upperCase.
 * - O método substring de "String" permite a seleção de caracteres dentro de uma string original de uma forma livre.
 * - O método trim de "String" remove os valores em branco que temos no começo e fim da String.
 */