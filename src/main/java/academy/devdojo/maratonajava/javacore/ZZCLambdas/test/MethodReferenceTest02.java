package academy.devdojo.maratonajava.javacore.ZZCLambdas.test;

import academy.devdojo.maratonajava.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 100), new Anime("Dragon Ball", 200), new Anime("Beyblade", 399)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort(((o1, o2) -> animeComparators.compareByEpisodesNonStatic(o1,o2)));
        System.out.println(animeList);
    }
}
