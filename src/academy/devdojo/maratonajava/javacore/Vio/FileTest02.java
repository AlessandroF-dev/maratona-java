package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada ? " + isDiretorioCreated);
        File fileAquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileAquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criadp ? " + isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileAquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado ? " + isFileCreated);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado ? " + isDiretorioRenomeado);
    }
}
