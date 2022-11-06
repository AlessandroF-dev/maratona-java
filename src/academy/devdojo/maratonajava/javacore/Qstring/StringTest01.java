package academy.devdojo.maratonajava.javacore.Qstring;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Alessandro"; //String constant pool
        String nome2 = "Alessandro";
        nome = nome.concat(" Fernandes");

        System.out.println(nome);
        System.out.println(nome == nome2);
    }
}
