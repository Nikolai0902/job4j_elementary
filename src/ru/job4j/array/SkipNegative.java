package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int d = 0; d < array[i].length; d++) {
                if (array[i][d] < 0) {
                    array[i][d] = 0;
                }
            }
        }
        return array;
    }
}


