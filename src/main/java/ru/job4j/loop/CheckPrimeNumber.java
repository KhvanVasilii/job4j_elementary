package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number; i++) {
            if (number == i) {
                return true;
            } else if (number % i == 0) {
                break;
            }
        }
        return false;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
