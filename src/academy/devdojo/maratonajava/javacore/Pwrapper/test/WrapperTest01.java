package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shorP = 1;
        int intP = 1;
        Long longP = 1L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'M';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shorW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 1L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'M';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}

/** 106 - Classes Utilitárias - Wrappers pt 01
 *
 * - Os Wrapper são conhecidos na linguagem Java como classes especiais que
 * possuem métodos capazes de fazer conversões em variáveis primitivas e também
 * de encapsular tipos primitivos para serem trabalhados como objetos.
 *
 *         Byte byteW = 1;
 *         Short shorW = 1;
 *         Integer intW = 1;
 *         Long longW = 1L;
 *         Float floatW = 10F;
 *         Double doubleW = 10D;
 *         Character charW = 'M';
 *         Boolean booleanW = false;
 *
 * 107 - Classes Utilitárias - Wrappers pt 02
 *
 * - Unboxing: transformar o tipo Wrapper em um tipo primitivo.
 *
 * - Autoboxing: transformar o tipo primitivo em Wrapper.
 * */
