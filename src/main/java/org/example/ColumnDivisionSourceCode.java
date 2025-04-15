package org.example;

import static org.example.ColumnDivision.*;

public class ColumnDivisionSourceCode {

    protected static void countTheResultOfColumn(long dividend, long divisor) {
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

                DivisionLines.appendDivisionLines(i, currentNumber, subtractedNumber, isNegative);

                quotient.append(currentNumber / divisor);
                remainder.replace(0, remainder.length(), String.valueOf(remaiderNumber));
                currentNumber = Parser.parse(remainder.toString());
            } else {
                if (i >= digits.length) {
                    quotient.append(0);
                }
            }
            if (i == digits.length - 1) {
                result.append(String.format("%" + (i + 2) + "s", currentNumber)).append("\n");
            }
        }
        if (isNegative) {
            DivisionLines.setQuotient("-" + quotient.toString());
        }
    }
}
