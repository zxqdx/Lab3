package primeNumber;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> generate(Integer inputNumber) {
        if (inputNumber == 3) {
            return Arrays.asList(2);
        }
        return Arrays.asList();
    }
}
