package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels){
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: drama.add(lightNovel); break;
                case ROMANCE: drama.add(lightNovel); break;
            }
        }

        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelMap);

        System.out.println("----------------------------------------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
