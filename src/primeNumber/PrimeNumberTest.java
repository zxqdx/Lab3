package primeNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static primeNumber.PrimeNumber.generate;

@RunWith(Parameterized.class)
public class PrimeNumberTest {
    private Integer inputNumber;
    private List<Integer> expectedResult;

    private static List<Integer> list(Integer...integers) {
        return Arrays.asList(integers);
    }

    public PrimeNumberTest(Integer inputNumber, List<Integer> expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {2, list()},
                {3, list(2)},
                {4, list(2, 3)},
                {5, list(2, 3)},
                {6, list(2, 3, 5)},
                {7, list(2, 3, 5)},
                {10, list(2, 3, 5, 7)},
                {13, list(2, 3, 5, 7, 11)},
                {16, list(2, 3, 5, 7, 11, 13)}
        });
    }

    @Test
    public void testPrimeNumberGenerate() {
        System.out.println("Testing number: " + inputNumber);
        assertEquals(expectedResult, generate(inputNumber));
    }

}
