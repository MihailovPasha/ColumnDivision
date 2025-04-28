package org.example;

import static org.example.ColumnDivisionService.result;

public class DivisionLinesOutputFormatter {
    public static void appendDivisionLines(int index, long currentNumber, long subtractedNumber, boolean isNegative) {
        String lastRemainder = String.format("%" + (index + 2) + "s", "_" + currentNumber);
        result.append(lastRemainder).append("\n");

        String subtractingValue = String.format("%" + (index + 2) + "s", subtractedNumber);
        result.append(subtractingValue).append("\n");

        String line = String.format("%" + (index + 3) + "s", "__" + "\n");
        result.append(line);
    }

    public static void setQuotient(String quotient) {
        ColumnDivisionService.quotient.replace(0, ColumnDivisionService.quotient.length(), quotient);
    }
}
