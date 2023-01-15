package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.IntStream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n -> n % 2 ==0).forEach(n -> System.out.println(n + " "));
        System.out.println("---------------");
    }
}
