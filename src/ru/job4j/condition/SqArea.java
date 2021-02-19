package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = p / (2 * (k + 1));
        double rsl1 = rsl * k;
        double rsl2 = rsl * rsl1;
        return rsl2;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result1);
    }
}
