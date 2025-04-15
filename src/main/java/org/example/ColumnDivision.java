package org.example;

abstract class ColumnDivision {
    protected static StringBuilder result = new StringBuilder();
    protected static StringBuilder remainder = new StringBuilder();
    protected static StringBuilder quotient = new StringBuilder();

    public String calculateAndFormat(long dividend, long divisor) {
        countTheResultOfColumn(dividend, divisor);
        String initialFormat = formatOutputBefore(dividend, divisor, quotient.toString());
        String finalFormat = formatOutputAfter(dividend, divisor);
        return initialFormat + result.toString() + finalFormat;
    }

    protected abstract String formatOutputBefore(long dividend, long divisor, String quotient);

    protected abstract void countTheResultOfColumn(long dividend, long divisor);

    protected abstract String formatOutputAfter(long dividend, long divisor);


}
