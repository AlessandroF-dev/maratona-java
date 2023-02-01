package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapreadWrite {
    private final Map<String, String> map = new HashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapreadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE lock%n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys(){
        rwl.readLock().lock();
        try{
            return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}
public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapreadWrite mapreadWrite = new MapreadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i <20; i++) {
                mapreadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };
        Runnable reader = () -> {
            if (rwl.isWriteLocked()){
                System.out.println("WRITE LOCKED!");
            }
            rwl.readLock().lock();
            System.out.println("FINALLY I GOT THE DAMN LOCK");
            try {
                System.out.println(Thread.currentThread().getName() + " " + mapreadWrite.allKeys());
            }finally {
                rwl.readLock().unlock();
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();
    }
}
