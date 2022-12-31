package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 9.9),
            new LightNovel("Pokemon", 5.9),
            new LightNovel("Beyblade", 4.9),
            new LightNovel("Dragon Ball Z", 6.9),
            new LightNovel("Cavaleiros do Zodíaco", 7.9),
            new LightNovel("One Piece", 10.9)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if (lightNovel.getPrice()<=4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size()>=3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
