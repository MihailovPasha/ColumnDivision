import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColumnDivisionCalculatorTest {
    @Before
    public void setParameters() {
        ColumnDivisionService.quotient.setLength(0);
        ColumnDivisionService.result.setLength(0);
    }

    @Test
    public void testPositiveNumbers() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(78945, 4);
        String expectedQuotient = "19736";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNegativeDividend() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(-900034561, 7);
        String expectedQuotient = "-128576365";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNegativeDivisor() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(12345675, -3);
        String expectedQuotient = "-204115225";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testBothNegative() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(-788895441, -9);
        String expectedQuotient = "8765549";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testDivisionWithZero() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(0, 12342345);
        String expectedQuotient = "0";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testDivisionOfTheNumberOfItself() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(289573463, 289573463);
        String expectedQuotient = "1";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

    @Test
    public void testNumbersWithMoreNulls() {
        ColumnDivisionCalculator.countTheDivisionIntoColumn(1200000012, 12);
        String expectedQuotient = "10000001";
        assertEquals(expectedQuotient, ColumnDivisionService.quotient.toString());
    }

}
