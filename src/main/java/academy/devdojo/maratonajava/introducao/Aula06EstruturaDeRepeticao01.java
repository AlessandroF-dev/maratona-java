package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count <= 10) {
            System.out.println(count++);
        }
        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        for (int i= 0; count <= 10; count++) {
            System.out.println("For" + count++);
        }
    }
}
