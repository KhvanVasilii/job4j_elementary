package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; !prime; i++) {
            if (number == 1 || i != number && number % i == 0) {
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
