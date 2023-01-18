package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 9.9),
            new LightNovel("Pokemon", 5.9),
            new LightNovel("Beyblade", 4.9),
            new LightNovel("Dragon Ball Z", 6.9),
            new LightNovel("Cavaleiros do Zodíaco", 7.9),
            new LightNovel("Cavaleiros do Zodíaco", 7.9),
            new LightNovel("One Piece", 10.9)
    ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        // utilizando Stream e o maxBy and max para trazer os produtos com preço mais alto

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        //soma

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        //média

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        // Essa classe DoubleSummaryStatistics faz o summary de count, sum, min, average and max

        System.out.println("----------------");
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(" | "));
        System.out.println(titles);
        // o método joining permite unir todos os títulos em uma única String, podendo ter algum caracter como delimitador

    }
}
