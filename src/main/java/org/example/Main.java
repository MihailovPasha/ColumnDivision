package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DivisionFormatType format = InputReader.readFormat(scanner);
        long dividend = InputReader.readNumber(scanner, "Введите делимое:");
        long divisor = InputReader.readNumber(scanner, "Введите делитель:");

        DivisionService divisionService = new DivisionFormatter();
        System.out.println(divisionService.divideAndFormat(format, dividend, divisor));

    }
}
