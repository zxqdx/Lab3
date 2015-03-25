package primeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> generate(Integer inputNumber) {
        List<Integer> primes = new ArrayList<Integer>();
        if (inputNumber > 2) {
            primes.add(2);
        }
        return primes;
    }
}
