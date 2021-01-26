package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro are " + dollar + " dollar ");

        int in = 140;
        int expected = 2;
        int out1 = Converter.rubleToEuro(in);
        boolean passed1 = expected == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        int out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out2;
        System.out.println("140 dollar are 2. Test result : " + passed2);

    }
}