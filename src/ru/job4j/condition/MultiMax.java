package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            result = first;
        } else {
            if (second > third) {
                result = second;
            } else {
                result = third;
            }
        }
        return result;
    }

    public static void main(String[] args) {
       int res = MultiMax.max(1, 4, 2);
        System.out.println(res);
    }
}

