import org.example.*;
import org.example.DivisionFormatType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RussianInterpretationServiceTest {
    private RussianInterpretationService service;

    @Before
    public void setParameters() {
        service = new RussianInterpretationService();
        ColumnDivisionService.quotient.setLength(0);
        ColumnDivisionService.result.setLength(0);
        ColumnDivisionService.remainder.setLength(0);
    }

    @Test
    public void testFullDivisionProcessWithPositiveNumbers() {
        String result = service.divideAndFormat(DivisionFormatType.RUSSIAN, 12345, 67);
        String expected = "_12345|67\n" +
                          "  67  |---\n" +
                          "  __  |184\n" +
                          " _564\n" +
                          "  536\n" +
                          "   __\n" +
                          "  _285\n" +
                          "   268\n" +
                          "    __\n" +
                          "    17\n";
        assertEquals(expected, result);
    }

    @Test
    public void testFullDivisionProcessWithNegativeDivisor() {
        String result = service.divideAndFormat(DivisionFormatType.RUSSIAN,456324645, -13);
        String expected = "_456324645|-13\n" +
                          " 39       |--------\n" +
                          " __       |-3511895\n" +
                          " _66\n" +
                          "  65\n" +
                          "  __\n" +
                          "  _13\n" +
                          "   13\n" +
                          "   __\n" +
                          "    _24\n" +
                          "     13\n" +
                          "     __\n" +
                          "    _116\n" +
                          "     104\n" +
                          "      __\n" +
                          "     _124\n" +
                          "      117\n" +
                          "       __\n" +
                          "       _75\n" +
                          "        65\n" +
                          "        __\n" +
                          "        10\n";
        assertEquals(expected, result);
    }

    @Test
    public void testFullDivisionProcessWithNegativeDividend() {
        String result = service.divideAndFormat(DivisionFormatType.RUSSIAN,-12345, 67);
        String expected = "_-12345|67\n" +
                          "  67  |----\n" +
                          "  __  |-184\n" +
                          " _564\n" +
                          "  536\n" +
                          "   __\n" +
                          "  _285\n" +
                          "   268\n" +
                          "    __\n" +
                          "    17\n";
        assertEquals(expected, result);
    }
}
