package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public void withDrawal(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
