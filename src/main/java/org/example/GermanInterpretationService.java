package org.example;

public class GermanInterpretationService extends ColumnDivisionService {
    public String formatOutputBefore(long dividend, long divisor, String quotient) {
        String sign = "";
        if (quotient.startsWith("-")) {
            sign = "-";
        }
        return " " + dividend + " : " + divisor + " = " + sign + quotient.replace("-", "") + "\n";
    }

    public void countTheResultOfColumn(long dividend, long divisor) {
        ColumnDivisionCalculator.countTheResultOfColumn(dividend, divisor);
    }

    public String formatOutputAfter(long dividend, long divisor) {
        return "";
    }
}
