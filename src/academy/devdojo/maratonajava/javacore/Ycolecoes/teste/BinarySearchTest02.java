package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 10.9));
        mangas.add(new Manga(3L, "Pokemon", 49.9));
        mangas.add(new Manga(2L, "Beyblade", 30));
        mangas.add(new Manga(1L, "Cavaleiros dos Zodíacos", 35.9));

//        Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(5L, "Naruto", 19.9);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
