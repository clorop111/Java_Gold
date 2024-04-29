package ex07;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
  public static void main(String[] args) {
    ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);

    exec.scheduleWithFixedDelay(() -> {
      System.out.print("A");
    },1, 1, TimeUnit.SECONDS);

    exec.scheduleWithFixedDelay(() -> {
      System.out.print("B");
    },1, 1, TimeUnit.SECONDS);

    try {
      Thread.sleep(10000);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt(); // Here!
      throw new RuntimeException(ex);
    }
    exec.shutdown();

  }
}
