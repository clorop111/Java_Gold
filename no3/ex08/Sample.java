package ex08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {
  public static void main(String[] args) {
    ExecutorService exec =Executors.newSingleThreadExecutor();
    Future future = exec.submit(() -> {
      try {
        System.out.println("start");
        Thread.sleep(20000);
        System.out.println("end");
      } catch (InterruptedException e){
        throw new RuntimeException(e);
      }
    });

    try {
      if (future.get() == null) {
        System.out.println("finish");
      }
    } catch (Exception e) {
      Thread.currentThread().interrupt(); // Here!
      throw new RuntimeException(e);
    }
  }
}
