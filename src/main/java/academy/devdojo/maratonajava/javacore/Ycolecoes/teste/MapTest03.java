package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alessandro Fernandes");
        Consumidor consumidor2 = new Consumidor("Willian Suane");

        Manga manga1 = new Manga(5L, "Naruto", 19.9);
        Manga manga2 = new Manga(4L, "Dragon Ball Z", 10.9);
        Manga manga3 = new Manga(3L, "Pokemon", 49.9);
        Manga manga4 = new Manga(2L, "Beyblade", 30);
        Manga manga5 = new Manga(1L, "Cavaleiros dos Zodíacos", 35.9);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("-------" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("----------" + manga.getNome());
            }
        }
    }
}
