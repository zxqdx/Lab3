package primeNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;
import static primeNumber.PrimeNumber.generate;

@RunWith(Parameterized.class)
public class PrimeNumberTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumber primeNumber;

    private static List<Integer> list(Integer...integers) {
        return Arrays.asList(integers);
    }

    public PrimeNumberTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        primeNumber = new PrimeNumber();
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
            {2, list()}
        });
    }


}
