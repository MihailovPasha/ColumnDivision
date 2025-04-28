package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputReader {
    private InputReader() {}
    public static DivisionFormatType readFormat(Scanner scanner) {
        System.out.println("Введите формат задания (russian или german): ");
        String formatColumn = scanner.nextLine().trim().toUpperCase();

        try {
            return DivisionFormatType.valueOf(formatColumn);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный формат. Используйте 'russian' или 'german'.");
            scanner.close();
            return null;
        }
    }

    public static long readNumber(Scanner scanner, String message) {
        System.out.println(message);
        try {
            return scanner.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("Неправильный формат ввода. Пожалуйста, введите целые числа для делимого и делителя.");
            scanner.close();
            return 0;
        }
    }
}
