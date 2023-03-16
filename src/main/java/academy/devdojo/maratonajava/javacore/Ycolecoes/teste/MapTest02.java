package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alessandro Fernandes");
        Consumidor consumidor2 = new Consumidor("Willian Suane");

        Manga manga1 = new Manga(5L, "Naruto", 19.9);
        Manga manga2 = new Manga(4L, "Dragon Ball Z", 10.9);
        Manga manga3 = new Manga(3L, "Pokemon", 49.9);
        Manga manga4 = new Manga(2L, "Beyblade", 30);
        Manga manga5 = new Manga(1L, "Cavaleiros dos Zodíacos", 35.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
