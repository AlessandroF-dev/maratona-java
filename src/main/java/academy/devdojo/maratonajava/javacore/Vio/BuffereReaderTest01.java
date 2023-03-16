package academy.devdojo.maratonajava.javacore.Vio;

import java.io.*;

public class BuffereReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
