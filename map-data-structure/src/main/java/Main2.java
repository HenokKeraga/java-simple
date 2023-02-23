import java.time.Clock;
import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        Clock clock = Clock.systemUTC();
        var start = clock.millis();
        long start2 = System.currentTimeMillis();
        Thread.sleep(Duration.ofSeconds(1).toMillis());

        System.out.println(clock.millis());
        long end2 = System.currentTimeMillis();
        System.out.println(TimeUnit.SECONDS.convert(clock.millis() - start, TimeUnit.MILLISECONDS));
        System.out.println(TimeUnit.SECONDS.convert(end2 - start2, TimeUnit.MILLISECONDS));

        // array of numbers
        int[] numbers = new int[]{4, 5, 1, 3, 7, 4, 1, 5};
        var ele = new Melon("Gac", 1200);
        Melon[] melons = new Melon[]{
                new Melon("Crenshaw", 2000), new Melon("Gac", 1200), new Melon("Bitter", 2200)};
//        Comparator<Melon> comparator=(m1,m2)->m1.
//        var i = Arrays.binarySearch(melons, ele,);

        for (Melon melon : melons) {
            if (ele.equals(melon)) {
                System.out.println("true");
            }
        }

        var b = Arrays.asList(melons).contains(ele);

        System.out.println(b);
        System.out.println(Arrays.equals(melons, melons));
        Function<Melon, Long> keyExtractorFunction = melon -> Long.valueOf(melon.weight());

        Comparator comparator = Comparator.comparing(keyExtractorFunction, (w1, w2) -> Arrays.compare(new long[]{w2}, new long[]{w1}));

        System.out.println(Arrays.equals(melons, melons, comparator));

        int[] numArray = {1,3};

        var macValue = Arrays.stream(numArray).max().getAsInt();
        System.out.println(macValue);


    }
}

record Melon(String type, int weight) {
}