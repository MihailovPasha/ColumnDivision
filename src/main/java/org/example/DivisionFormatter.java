package org.example;


public class DivisionFormatter implements DivisionService {

    @Override
    public String divideAndFormat(DivisionFormatType format, long dividend, long divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        if (format == null) {
            throw new IllegalArgumentException("Не указан формат деления.");
        }

        ColumnDivisionService interpreter;

        switch (format) {
            case RUSSIAN -> {
                interpreter = new RussianInterpretationService();
            }
            case GERMAN -> {
                interpreter = new GermanInterpretationService();
            }
            default -> throw new IllegalArgumentException("Неизвестный формат:" + format);
        }
        return interpreter.divideAndFormat(format, dividend, divisor);
    }
}
