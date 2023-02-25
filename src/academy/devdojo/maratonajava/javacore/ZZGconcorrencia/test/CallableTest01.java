package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable <String>{

    @Override
    public String call() throws Exception {
        Math.random();
        int number = ThreadLocalRandom.current().nextInt(1,11);
        for (int i = 0; i< number; i++){
            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished and the rando number is %d", Thread.currentThread().getName(), number);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executorService.shutdown();

    }
}
