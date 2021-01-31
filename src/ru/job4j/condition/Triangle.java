package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean a = ab + ac > bc;
        boolean b = ac + bc > ab;
        boolean c = ab + bc > ac;
        return a && b && c;
    }

    public static void main(String[] args) {
        boolean result = exist(2, 2, 10);
        System.out.println(result);
    }
}
