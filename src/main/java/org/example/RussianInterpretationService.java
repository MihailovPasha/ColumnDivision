package org.example;

public class RussianInterpretationService extends ColumnDivisionService {

    public String formatOutputBefore(long dividend, long divisor, String quotient) {
        return "";
    }

    public void countTheResultOfColumn(long dividend, long divisor) {
        ColumnDivisionCalculator.countTheResultOfColumn(dividend, divisor);
    }

    public String formatOutputAfter(long dividend, long divisor) {
        int[] lines = new int[3];
        for (int i = 0, j = 0; i < result.length(); i++) {
            if (result.charAt(i) == '\n') {
                lines[j] = i;
                j++;
            }
            if (j == 3) {
                break;
            }
        }
        int pass = countDigits(dividend) + 1 - lines[0];
        result.insert(lines[2], appendStrings(pass, " ") + "|" + quotient);
        result.insert(lines[1], appendStrings(pass, " ") + "|" +
                appendStrings(String.valueOf(quotient).length(), "-"));
        result.replace(1, lines[0], dividend + "|" + divisor);
        return "";
    }

    private static String appendStrings(int numberOfSymbols, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfSymbols; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    private static int countDigits(long dividend) {
        return (int) Math.log10(Math.abs(dividend)) + 1;
    }
}
