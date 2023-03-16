package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String name = "Naruto";

    void print(final String param){
        final String lastName = "Uzumaki";

        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
