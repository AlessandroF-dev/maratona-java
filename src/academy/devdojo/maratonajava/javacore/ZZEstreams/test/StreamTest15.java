package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 9.9, Category.DRAMA),
            new LightNovel("Pokemon", 5.9, Category.DRAMA),
            new LightNovel("Beyblade", 4.9, Category.ROMANCE),
            new LightNovel("Dragon Ball Z", 6.9, Category.ROMANCE),
            new LightNovel("Cavaleiros do Zodíaco", 7.9, Category.FANTASY),
            new LightNovel("Cavaleiros do Zodíaco", 7.9, Category.FANTASY),
            new LightNovel("One Piece", 10.9, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        System.out.println("-----------------------------------------");

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);
        System.out.println("------------------------------------------");

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 7 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
