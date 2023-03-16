package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*Tipos primitivos guardam em memória valores simples:
        int, double, float, char, byte, short, long, boolean
        Para criar uma variável é necessário o tipo e o nome;*/

        int age = 22;
        long numeroGrande = 123123;
        double salarioDouble = 2000;
        float salarioFloat = 5000;
        byte ageByte = 22;
        short idadeShort = 22;
        boolean isMaiorDeIdade = true;
        char caractere = '\u8841';
        String nome = "Alessandro";
        /*String não é um tipo primitivo, e sim uma classe do java
        por isso ela precisa ter o "S" em maiúsculo*/

        System.out.println("I have "+ age + " years old");
        System.out.println(isMaiorDeIdade);
        System.out.println("char " + caractere);
        System.out.println("My sálario in the next work "+ salarioFloat );
        System.out.println("Hello, my name is " + nome);
    }
}
