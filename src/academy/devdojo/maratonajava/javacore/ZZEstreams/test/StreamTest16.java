package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.Stream;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
    }
    private static void sumFor (long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i<= num; i++){
           result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }
    private static void sumStreamIterate (long num) {
        System.out.println("Sum StreamIterate");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }
}
