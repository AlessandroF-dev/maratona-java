package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Manga(5L, "Naruto", 19.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 10.9));
        mangas.add(new Manga(3L, "Pokemon", 49.9));
        mangas.add(new Manga(2L, "Beyblade", 30));
        mangas.add(new Manga(1L, "Cavaleiros dos Zodíacos", 35.9));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
