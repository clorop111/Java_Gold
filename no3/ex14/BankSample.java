package ex14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSample {
  public static void main(String[] args) {
    BankAccount a = new BankAccount(100);
    BankAccount b = new BankAccount(100);

    ExecutorService exec = Executors.newFixedThreadPool(2);
    exec.submit(() -> {
      synchronized (a) {
        a.withdrawals(20);
        synchronized (b) {
          b.deposit(20);
        }
      }
    });

    exec.submit(() -> {
      synchronized (a) {
        a.deposit(30);
        synchronized (b) {
          b.withdrawals(30);
        }
      }
    });
  }
}
