package academy.devdojo.maratonajava.javacore.ZZCLambdas.test;

import academy.devdojo.maratonajava.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 100), new Anime("Dragon Ball", 200), new Anime("Beyblade", 399)));
        animeList.sort(((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
