package ex04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
  public static void main(String[] args) {
    ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
    exec.schedule(() -> { System.out.println("finish");
      exec.shutdown();
    }, 1, TimeUnit.SECONDS);

    int count = 0;
    while (true) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt(); // Here!
        throw new RuntimeException(ex);
      }
      if (exec.isShutdown()) {
        break;
      }
      System.out.println((++count) * 100 + " ms");
    }
  }
}
