package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 5.39;
        });
        System.out.println(doSomeThing());
        try {
            Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: " + dollarRequest);
        executorService.shutdown();
    }
    private static long doSomeThing (){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += 1;
        }
        return sum;
    }
}