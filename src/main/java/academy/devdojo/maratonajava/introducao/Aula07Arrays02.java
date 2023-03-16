package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Ale";
        nomes[1] = "Be";
        nomes[2] = "Be e Ale";
        nomes[3] = "Be, Ale e Mali";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes);
        }
    }
}
