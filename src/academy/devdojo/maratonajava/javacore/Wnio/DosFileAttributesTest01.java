package academy.devdojo.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");
        if(Files.notExists(path)) Files.createFile(path);
//        Files.createFile(path);
//        Files.setAttribute(path, "dos:hidden", true);
//        Files.setAttribute(path, "dos:readonly", true);
//        Files.setAttribute(path, "dos:hidden", false);
//        Files.setAttribute(path, "dos:readonly", false);
//
//        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
//        System.out.println(dosFileAttributes.isHidden());
//        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println(fileAttributeView.readAttributes().isReadOnly());
        System.out.println(fileAttributeView.readAttributes().isHidden());

    }
}