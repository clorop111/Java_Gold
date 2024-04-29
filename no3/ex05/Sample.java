package ex05;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
  public static void main(String[] args) {
    ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();

    exec.scheduleAtFixedRate(() -> {
      System.out.println("interrupt");
    }, 1, 1, TimeUnit.SECONDS);

    int count = 0;
    while (true) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt(); // Here!
        throw new RuntimeException(ex);
      }
      System.out.print(">");
      count++;
      if(count == 100) {
        exec.shutdown();
        break;
      }  
    }
  }
}
