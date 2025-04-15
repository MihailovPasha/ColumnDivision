package org.example;

public class Parser {
    protected static long parse(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
