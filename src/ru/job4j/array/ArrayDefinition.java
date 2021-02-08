package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("" + ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prise = new float[40];
        System.out.println(prise.length);
    }
}