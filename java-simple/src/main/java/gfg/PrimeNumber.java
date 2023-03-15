package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 16;
        List<Integer> primes = sieveOfEratosthenes(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);

    }

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
