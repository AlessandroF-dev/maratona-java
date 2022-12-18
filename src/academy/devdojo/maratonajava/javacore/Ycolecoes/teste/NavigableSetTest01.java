package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 10.9));
        mangas.add(new Manga(3L, "Pokemon", 49.9));
        mangas.add(new Manga(2L, "Beyblade", 30));
        mangas.add(new Manga(1L, "Cavaleiros dos Zodíacos", 35.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga deathNote = new Manga(30L, "Death Note", 49.9);
        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("-----------------");
        System.out.println(mangas.lower(deathNote));
        System.out.println(mangas.floor(deathNote));
        System.out.println(mangas.higher(deathNote));
        System.out.println(mangas.ceiling(deathNote));

        System.out.println("-----------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
