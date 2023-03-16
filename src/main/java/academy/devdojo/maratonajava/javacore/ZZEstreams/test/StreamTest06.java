package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 8)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() < 8)
                .max(Comparator.comparing(LightNovel::getPrice).reversed())
                .ifPresent(System.out::println);
    }
}
