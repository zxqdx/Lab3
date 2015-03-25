package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int i) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (i > 1) {
            for (; i % candidate == 0; i /= candidate) {
                primes.add(candidate);
            }
            candidate++;
        }
        if (i > 1) {
            primes.add(i);
        }
        return primes;
    }
}
