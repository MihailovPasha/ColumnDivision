import org.example.ColumnDivisionService;
import org.example.DivisionFormatType;
import org.example.GermanInterpretationService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GermanInterpretationServiceTest {
    private GermanInterpretationService service;

    @Before
    public void setParameters() {
        service = new GermanInterpretationService();
        ColumnDivisionService.quotient.setLength(0);
        ColumnDivisionService.result.setLength(0);
        ColumnDivisionService.remainder.setLength(0);
    }

    @Test
    public void testFullDivision() {
        String result = service.divideAndFormat(DivisionFormatType.GERMAN,546743563, 45);
        String expected = " 546743563 : 45 = 12149856\n" +
                          "_54\n" +
                          " 45\n" +
                          " __\n" +
                          " _96\n" +
                          "  90\n" +
                          "  __\n" +
                          "  _67\n" +
                          "   45\n" +
                          "   __\n" +
                          "  _224\n" +
                          "   180\n" +
                          "    __\n" +
                          "   _443\n" +
                          "    405\n" +
                          "     __\n" +
                          "    _385\n" +
                          "     360\n" +
                          "      __\n" +
                          "     _256\n" +
                          "      225\n" +
                          "       __\n" +
                          "      _313\n" +
                          "       270\n" +
                          "        __\n" +
                          "        43\n";
        assertEquals(expected, result);
    }

    @Test
    public void formatOutputBeforePositiveNumbers() {
        String result = service.formatOutputBefore(56473485, 248, "227715");
        assertEquals(" 56473485 : 248 = 227715\n", result);
    }

    @Test
    public void formatOutputBeforeNegativeDivisor() {
        String result = service.formatOutputBefore(234545643, -12, "-19545470");
        assertEquals(" 234545643 : -12 = -19545470\n", result);
    }

    @Test
    public void formatOutputBeforeNegativeDividend() {
        String result = service.formatOutputBefore(-234545643, 12, "-19545470");
        assertEquals(" -234545643 : 12 = -19545470\n", result);
    }

}
