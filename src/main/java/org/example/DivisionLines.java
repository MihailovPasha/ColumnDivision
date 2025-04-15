package org.example;

import static org.example.ColumnDivision.*;

public class DivisionLines {
    protected static void appendDivisionLines(int index, long currentNumber, long subtractedNumber, boolean isNegative) {
        StringBuilder negativeNumber = new StringBuilder();
        String sign = isNegative ? "-" : "";

        String lastRemainder = String.format("%" + (index + 2) + "s", "_" + currentNumber);
        result.append(lastRemainder).append("\n");

        String subtractingValue = String.format("%" + (index + 2) + "s", subtractedNumber);
        result.append(subtractingValue).append("\n");

        String line = String.format("%" + (index + 3) + "s", "__" + "\n");
        result.append(line);
    }

    protected static void setQuotient(String quotient) {
        ColumnDivision.quotient.replace(0, ColumnDivision.quotient.length(), quotient);
    }
}
