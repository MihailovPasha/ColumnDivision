package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите формат задания (russian или german): ");
            String formatColumn = scanner.nextLine().trim().toUpperCase();
            DivisionFormatType format;

            try {
                format = DivisionFormatType.valueOf(formatColumn);
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный формат. Используйте 'russian' или 'german'.");
                return;
            }

            System.out.println("Введите делимое:");
            long dividend = scanner.nextLong();

            System.out.println("Введите делитель:");
            long divisor = scanner.nextLong();

            System.out.println(ColumnDivisionFormatter.defineTheFormat(format, dividend, divisor));

        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат ввода. Пожалуйста, введите целые числа для делимого и делителя.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
