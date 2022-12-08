package academy.devdojo.maratonajava.javacore.wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/ale");
        Path clazz = Paths.get("/home/ale/aledev/HelloWord.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/ale");
        Path absoluto2 = Paths.get("/user/local");
        Path absoluto3 = Paths.get("/home/ale/aledev/HelloWord.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20221208");

        System.out.println("1 "+ absoluto1.relativize(absoluto3));
        System.out.println("2 "+ absoluto3.relativize(absoluto1));
        System.out.println("3 "+ absoluto1.relativize(absoluto2));
    }
}
