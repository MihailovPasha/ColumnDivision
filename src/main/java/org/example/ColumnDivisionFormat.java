package org.example;


public class ColumnDivisionFormat {

    protected static String defineTheFormat(Interpretation format, long dividend, long divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        if (format == null) {
            throw new IllegalArgumentException("Не указан формат деления.");
        }

        ColumnDivision interpreter;

        switch (format) {
            case RUSSIAN -> {
                interpreter = new RussianInterpretation();
            }
            case GERMAN -> {
                interpreter = new GermanInterpretation();
            }
            default -> throw new IllegalArgumentException("Неизвестный формат:" + format);
        }
        return interpreter.calculateAndFormat(dividend, divisor);
    }
}
