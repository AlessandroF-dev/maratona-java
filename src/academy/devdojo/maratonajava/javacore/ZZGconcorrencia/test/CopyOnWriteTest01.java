package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }
        Runnable runnableIteratpr = () -> {
            Iterator<Integer> iteratori = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iteratori.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableRemover = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d%n");
            }
        };

        new Thread(runnableIteratpr).start();
        new Thread(runnableIteratpr).start();
        new Thread(runnableRemover).start();
    }
}
