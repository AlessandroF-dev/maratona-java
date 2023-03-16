package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Alessandro"));
        System.out.println(tq.offer("Alessandro"));
        System.out.println(tq.offer("Alessandro", 10, TimeUnit.SECONDS));
        tq.put("aFernandes");
        if(tq.hasWaitingConsumer()){
            tq.transfer("aFernandes");
        }
        System.out.println(tq.tryTransfer("Mar Informática",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
        System.out.println(tq.take());
    }
}
