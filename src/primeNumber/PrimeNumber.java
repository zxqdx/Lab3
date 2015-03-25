package primeNumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> generate(Integer inputNumber) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < inputNumber; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
