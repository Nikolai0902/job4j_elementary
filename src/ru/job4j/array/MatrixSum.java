package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int d = 0; d < array[i].length; d++) {
                rsl = rsl + array[i][d];
            }
        }
        return rsl;
    }
}
