package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Naruto", 19.9,3));
        mangas.add(new Manga(4L, "Dragon Ball Z", 10.9, 4));
        mangas.add(new Manga(3L, "Pokemon", 49.9, 0));
        mangas.add(new Manga(2L, "Beyblade", 30, 0));
        mangas.add(new Manga(1L, "Cavaleiros dos Zodíacos", 35.9, 2));

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
