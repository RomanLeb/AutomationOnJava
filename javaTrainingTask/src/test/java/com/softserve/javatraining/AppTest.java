package com.softserve.javatraining;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest {
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, -1",
            "1, 0",
            "0, 1",
            "-1, -1",
            "0, 0"
    })
    public  void invalidArgumentsTest(int minimalSqr, int numbersCount){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            App.getNumbersListBasedOnSqrFunction(minimalSqr, numbersCount);
        });
    }
}
