package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int i) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (i > 1) {
            primes.add(i);
        }
        return primes;
    }
}
