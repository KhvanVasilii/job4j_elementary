package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstData = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != firstData) {
                result = false;
                break;
            }
        }
        return result;
    }
}
