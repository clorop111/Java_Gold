package ex12;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Sample {
    private int num = 0;
    public static void main(String[] args) {
        Sample s = new Sample();
        ExecutorService service 
                = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                for (int j = 0; j < 10000; j++) {
                   synchronized (s) {
                        s.num++;
                   }
                }
            });
        }
        service.shutdown();
    }
}
