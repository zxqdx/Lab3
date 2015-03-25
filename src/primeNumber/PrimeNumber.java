package primeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> generate(Integer inputNumber) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < inputNumber; i++) {
            if ((i == 2 || i % 2 != 0) && (i != 9)) {
                primes.add(i);
            }
        }
        return primes;
    }
}
