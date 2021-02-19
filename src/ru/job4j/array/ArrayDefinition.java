package ru.job4j.array;


public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("" + ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prise = new float[40];
        System.out.println(prise.length);

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Alexsandr";
        names[2] = "Vlad";
        names[3] = "Nikolai";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}