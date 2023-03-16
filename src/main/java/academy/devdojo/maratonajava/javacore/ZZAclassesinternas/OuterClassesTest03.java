package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest03 {
    private String name = "Alessandro";

    static class Nested{
        private String lastName = "Fernandes";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
