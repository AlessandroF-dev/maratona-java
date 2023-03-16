package academy.devdojo.maratonajava.javacore.ZZCLambdas.test;

import academy.devdojo.maratonajava.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators::new;
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 100), new Anime("Dragon Ball", 200), new Anime("Beyblade", 399)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeões", 35));
    }
}
