import java.util.concurrent.*;

public class Concurrency {
    public static void main(String[] args) {



        var scheduledExecutorService = Executors.newScheduledThreadPool(2);

//        scheduledExecutorService
//                .scheduleWithFixedDelay(() -> System.out.println("hello"), 1, 1, TimeUnit.SECONDS);

        var executorService = Executors.newFixedThreadPool(2);


      executorService.submit(()-> System.out.println("hellllll"));
    }
}
