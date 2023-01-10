package ru.netology.javaqa;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void csvTests(long amount, boolean registered, long expected) {
        long actual = new BonusService().calculate(amount, registered);
        assertEquals(expected, actual);
    }
}