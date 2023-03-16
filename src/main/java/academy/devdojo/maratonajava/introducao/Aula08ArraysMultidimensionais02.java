package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2]; //Array de 2 posições
        arrayInt[1] = new int[3]; //Array de 3 posições
        arrayInt[2] = new int[6]; //Array de 6 posções

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----------"); // "\n" pula uma linha
            for (int num : arrayBase) {
                System.out.print(num + " "); //System.out sem o "LN" imprime sem pular linhas
            }
        }
    }
}
