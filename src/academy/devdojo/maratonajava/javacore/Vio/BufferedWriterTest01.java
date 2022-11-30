package academy.devdojo.maratonajava.javacore.Vio;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        //BuferredWriter encapsula FileWriter, e foi criada para melhor performance
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Maratona Java, melhor curso do Brasil!" + "\nNão tem pra ninguém\n");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
