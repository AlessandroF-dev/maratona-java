package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 9.9),
            new LightNovel("Pokemon", 5.9),
            new LightNovel("Beyblade", 4.9),
            new LightNovel("Dragon Ball Z", 6.9),
            new LightNovel("Cavaleiros do Zodíaco", 7.9),
            new LightNovel("One Piece", 10.9)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
            .sorted(Comparator.comparing(LightNovel::getTitle))
            .filter(ln -> ln.getPrice() <= 10)
            .limit(3)
            .map(LightNovel::getTitle)
            .collect(Collectors.toList());

        System.out.println(titles);
    }
}
