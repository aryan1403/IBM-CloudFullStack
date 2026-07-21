package java04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thpoolex {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            exec.execute(() -> {
                System.out.println("Async task running: " + Thread.currentThread().getName());
            });
        }

        exec.shutdown();
    }
}
