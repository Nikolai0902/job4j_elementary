package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            return result;
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
       int res = MultiMax.max(20, 4000, 300);
        System.out.println(res);
    }
}

