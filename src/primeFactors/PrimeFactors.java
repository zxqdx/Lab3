package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int i) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        while (i % 2 == 0) {
            primes.add(2);
            i /= 2;
        }
        if (i > 1) {
            primes.add(i);
        }
        return primes;
    }
}
