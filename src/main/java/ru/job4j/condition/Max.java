package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int max = max(first, second);
        return max > third ? max : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int max = max(first, second, third);
        return max > fourth ? max : fourth;
    }

}
