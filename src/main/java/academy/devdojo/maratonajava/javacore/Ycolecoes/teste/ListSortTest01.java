package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("aNaruto");
        mangas.add("bDragon Ball Z");
        mangas.add("cPokemon");
        mangas.add("dBeyblade");
        mangas.add("eCavaleiros dos Zodíacos");
        Collections.sort(mangas); //organiza em ordem crescente (alfabetica ou númerica)

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(99.90);
        dinheiros.add(32.98);
        dinheiros.add(11.90);
        dinheiros.add(49.90);
        Collections.sort(dinheiros);

        System.out.println(dinheiros);

        for(String manga: mangas){
            System.out.println(manga);
        }
    }
}