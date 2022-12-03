package academy.devdojo.maratonajava.javacore.wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Aless\\PROJECTS DEV.ALE\\maratona-java\\file.txt");
        System.out.println(p1.getFileName());
        Path p2 = Paths.get("C:\\Users\\Aless\\PROJECTS DEV.ALE\\maratona-java","file.txt");
        System.out.println(p2.getFileName());
        Path p3 = Paths.get("C:", "Users", "Aless", "PROJECTS DEV.ALE", "maratona-java", "file.txt");
        System.out.println(p3.getFileName());
    }
}
/**
 * Path: É uma interface que foi inserida no pacote java.ni com intuito de substituir
 * a classe File, e orepresenta um caminho no sistema de arquivos, um caminho pode ser usado para localizar um arquivo ou diretório. Para instanciar,
 * ou obter uma instância de Path, utilizamos a classe Paths, para assim poder utilizar
 * seus métodos:
 * ```
 * Path p1 = Paths.get("C:\\Users\\Aless\\PROJECTS DEV.ALE\\maratona-java\\file.txt");
 * System.out.println(p1.getFileName());
 * Path p2 = Paths.get("C:\\Users\\Aless\\PROJECTS DEV.ALE\\maratona-java","file.txt");
 * System.out.println(p2.getFileName());
 * Path p3 = Paths.get("C:", "Users", "Aless", "PROJECTS DEV.ALE", "maratona-java", "file.txt");
 * System.out.println(p3.getFileName());
 * ```
 * Alguns métodos importantes da interface Path são:
 * - getFileName() - Retorna o sistema de arquivos que criou este objeto
 * - getName() - Retorna um elemento de nome deste caminho como um objeto Path
 * - getNameCount() - Retorna o número de elementos de nome no caminho
 * - subpath() - Retorna um Path relativo que é uma subsequência dos elementos de nome
 * deste caminho
 * - toFile() - Retorna um objeto File que representa esse camiho
 */
