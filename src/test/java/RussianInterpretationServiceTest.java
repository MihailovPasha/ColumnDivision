import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RussianInterpretationServiceTest {
    private RussianInterpretationService service;

    @Before
    public void setParameters() {
        service = new RussianInterpretationService();
        ColumnDivisionService.result.setLength(0);
        ColumnDivisionService.quotient.setLength(0);
    }

    @Test
    public void testFormatOutputAfterPositiveNumbers() {
        ColumnDivisionService.result.append(" _100\n  10\n __\n");
        ColumnDivisionService.quotient.append("10");

        String formatted = service.formatOutputAfter(100, 10);

        assertTrue(ColumnDivisionService.result.toString().contains("100|10"));
        assertTrue(ColumnDivisionService.result.toString().contains("|10"));
        assertEquals("", formatted);
    }

    @Test
    public void testFormatOutputAfterNegativeDividend() {
        ColumnDivisionService.result.append(" _-100\n  10\n __\n");
        ColumnDivisionService.quotient.append("-10");

        String formatted = service.formatOutputAfter(100, 10);

        assertTrue(ColumnDivisionService.result.toString().contains("100|10"));
        assertTrue(ColumnDivisionService.result.toString().contains("|-10"));
        assertEquals("", formatted);
    }

    @Test
    public void testFormatOutputAfterNegativeDivisor() {
        ColumnDivisionService.result.append(" _100\n  -10\n __\n");
        ColumnDivisionService.quotient.append("-10");

        String formatted = service.formatOutputAfter(100, 10);

        assertTrue(ColumnDivisionService.result.toString().contains("100|10"));
        assertTrue(ColumnDivisionService.result.toString().contains("|-10"));
        assertEquals("", formatted);
    }
}
