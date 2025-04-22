import org.example.ColumnDivisionService;
import org.example.GermanInterpretationService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GermanInterpretationServiceTest {
    private GermanInterpretationService service;

    @Before
    public void setParameters() {
        service = new GermanInterpretationService();
        ColumnDivisionService.result.setLength(0);
        ColumnDivisionService.quotient.setLength(0);
    }

    @Test
    public void formatOutputBeforePositiveNumbers() {
        ColumnDivisionService.quotient.append("5");
        String result = service.formatOutputBefore(100, 20, "5");
        assertEquals(" 100 : 20 = 5\n", result);
    }

    @Test
    public void formatOutputBeforeNegativeDivisor() {
        ColumnDivisionService.quotient.append("-5");
        String result = service.formatOutputBefore(100, -20, "-5");
        assertEquals(" 100 : -20 = -5\n", result);
    }

    @Test
    public void formatOutputBeforeNegativeDividend() {
        ColumnDivisionService.quotient.append("-5");
        String result = service.formatOutputBefore(-100, 20, "-5");
        assertEquals(" -100 : 20 = -5\n", result);
    }

}
