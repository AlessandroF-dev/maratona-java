package academy.devdojo.maratonajava.javacore.wnio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:**.bkp");
        matches(path1, "glob:**/*.{bkp,java,txt}");
        matches(path2, "glob:**/*.{bkp,java,txt}");
        matches(path3, "glob:**/*.{bkp,java,txt}");
        matches(path1, "glob:**/*.{bkp,java,txt}");
    }
    private static void matches (Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
