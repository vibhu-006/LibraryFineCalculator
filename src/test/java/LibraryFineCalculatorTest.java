import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryFineCalculatorTest {

    LibraryFineCalculator calculator =
            new LibraryFineCalculator();


    @Test
    void testOnTimeReturn() {

        assertEquals(
                0.0,
                calculator.calculateFine(0)
        );
    }


    @Test
    void testOneDayOverdue() {

        assertEquals(
                5.0,
                calculator.calculateFine(1)
        );
    }


    @Test
    void testFiveDaysOverdue() {

        assertEquals(
                25.0,
                calculator.calculateFine(5)
        );
    }


    @Test
    void testTenDaysOverdue() {

        assertEquals(
                50.0,
                calculator.calculateFine(10)
        );
    }


    @Test
    void testNegativeDays() {

        assertEquals(
                0.0,
                calculator.calculateFine(-2)
        );
    }
}