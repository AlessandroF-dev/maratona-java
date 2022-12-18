package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Naruto", 19.9,3));
        mangas.add(new Manga(4L, "Dragon Ball Z", 10.9, 4));
        mangas.add(new Manga(3L, "Pokemon", 49.9, 0));
        mangas.add(new Manga(2L, "Beyblade", 30, 0));
        mangas.add(new Manga(1L, "Cavaleiros dos Zodíacos", 35.9, 2));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
