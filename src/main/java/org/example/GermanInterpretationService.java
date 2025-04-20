package org.example;

public class GermanInterpretationService extends ColumnDivisionService {
    protected String formatOutputBefore(long dividend, long divisor, String quotient) {
        String sign = "";
        if (quotient.startsWith("-")) {
            sign = "-";
        }
        return " " + dividend + " : " + divisor + " = " + sign + quotient.replace("-", "") + "\n";
    }

    protected void countTheResultOfColumn(long dividend, long divisor) {
        ColumnDivisionCalculator.countTheResultOfColumn(dividend, divisor);
    }

    protected String formatOutputAfter(long dividend, long divisor) {
        return "";
    }
}
