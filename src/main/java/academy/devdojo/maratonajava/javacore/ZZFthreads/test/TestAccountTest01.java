package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class TestAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        TestAccountTest01 testAccountTest01 = new TestAccountTest01();
        Thread t1 = new Thread(testAccountTest01, "Ale");
        Thread t2 = new Thread(testAccountTest01, "Be");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(5);
            if (account.getBalance() < 0) {
                System.out.println("Deu ruim");
            }
        }
    }

    private synchronized void withDrawal(int amount) {
        System.out.println(Thread.currentThread().getName() + " ### fora do synchronized");
        synchronized (account) {
            System.out.println(Thread.currentThread().getName() + "*** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
                account.withDrawal(amount);
                System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());
            }
        }
    }
}
