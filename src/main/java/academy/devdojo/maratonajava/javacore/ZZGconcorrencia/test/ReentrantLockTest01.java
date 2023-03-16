package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
        System.out.printf("Thread %s entrou em uma sessão crítica%n", name);
        System.out.printf("%d Threads esperando na fila%n", lock.getQueueLength());
        System.out.printf("Threads %d vai esperar 2s%n", lock.getQueueLength());
        Thread.sleep(2000);
        System.out.printf("Threads %d finalizou a espera s%n", lock.getQueueLength());
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            if (lock.isHeldByCurrentThread())
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread (new Worker("A",lock)).start();
        new Thread (new Worker("B",lock)).start();
        new Thread (new Worker("C",lock)).start();
        new Thread (new Worker("D",lock)).start();
        new Thread (new Worker("E",lock)).start();
        new Thread (new Worker("F",lock)).start();
        new Thread (new Worker("G",lock)).start();
    }
}