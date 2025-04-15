package org.example;

public class GermanInterpretation extends ColumnDivision {
    protected String formatOutputBefore(long dividend, long divisor, String quotient) {
        String sign = "";
        if (quotient.startsWith("-")) {
            sign = "-";
        }
        return " " + dividend + " : " + divisor + " = " + sign + quotient.replace("-", "") + "\n";
    }

    protected void countTheResultOfColumn(long dividend, long divisor) {
        ColumnDivisionSourceCode.countTheResultOfColumn(dividend, divisor);
    }

    protected String formatOutputAfter(long dividend, long divisor) {
        return "";
    }
}
