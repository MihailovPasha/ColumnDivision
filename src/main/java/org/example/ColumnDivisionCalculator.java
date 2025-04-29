package org.example;

import static org.example.ColumnDivisionService.remainder;
import static org.example.ColumnDivisionService.result;
import static org.example.ColumnDivisionService.quotient;

public class ColumnDivisionCalculator {

    public static void countTheDivisionIntoColumn(long dividend, long divisor) {
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        String[] digits = String.valueOf(dividend).split("");
        long currentNumber;
        long subtractedNumber;
        long remaiderNumber;

        for (int i = 0; i < digits.length; i++) {
            remainder.append(digits[i]);
            currentNumber = Parser.parse(remainder.toString());

            if (currentNumber >= divisor) {
                remaiderNumber = currentNumber % divisor;
                subtractedNumber = (currentNumber / divisor) * divisor;

                DivisionLinesOutputFormatter.appendDivisionLines(i, currentNumber, subtractedNumber, isNegative);

                quotient.append(currentNumber / divisor);
                remainder.replace(0, remainder.length(), String.valueOf(remaiderNumber));
                currentNumber = Parser.parse(remainder.toString());
            } else {
                if (Parser.parse(String.valueOf(remainder)) == 0) {
                    quotient.append(0);
                }
            }
            if (i == digits.length - 1) {
                result.append(String.format("%" + (i + 2) + "s", currentNumber)).append("\n");
            }
        }
        if (isNegative) {
            DivisionLinesOutputFormatter.setQuotient("-" + quotient.toString());
        }
    }
}
