import org.example.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColumnDivisionCalculatorTest {
    @Test
    public void testPositiveNumbers() {
        ColumnDivisionCalculator.countTheResultOfColumn(78945, 4);
        String expectedQuotient = "19736";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNegativeDividend() {
        ColumnDivisionCalculator.countTheResultOfColumn(-12345, 5);
        String expectedQuotient = "-2469";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNegativeDivisor() {
        ColumnDivisionCalculator.countTheResultOfColumn(12345, -5);
        String expectedQuotient = "-2469";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testBothNegative() {
        ColumnDivisionCalculator.countTheResultOfColumn(-12345, -5);
        String expectedQuotient = "2469";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testDivisionWithZero() {
        ColumnDivisionCalculator.countTheResultOfColumn(0, 12345);
        String expectedQuotient = "0";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testDivisionOfTheNumberOfItself() {
        ColumnDivisionCalculator.countTheResultOfColumn(12345, 12345);
        String expectedQuotient = "1";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNumbersWithMoreNulls() {
        ColumnDivisionCalculator.countTheResultOfColumn(1200000012, 12);
        String expectedQuotient = "10000001";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

}
