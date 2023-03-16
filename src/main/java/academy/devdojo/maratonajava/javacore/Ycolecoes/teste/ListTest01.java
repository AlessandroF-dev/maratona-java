package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Ale");
        nomes.add("DevDojo");
        nomes2.add("Fernandes");
        nomes2.add("Academy");

        nomes.addAll(nomes2);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        nomes.add("Fernandes");
        System.out.println("-----------");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}