package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataForTest.csv")
    public void testSQRService(int downLimit, int upLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(downLimit, upLimit);

        Assertions.assertEquals(expected, actual);

    }

}
