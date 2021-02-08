package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void back12345to54321() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] resultArray = Turn.back(input);
        int[] expectArray = new int[]{5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void back345678to876543() {
        int[] input = new int[]{3, 4, 5, 6, 7, 8};
        int[] resultArray = Turn.back(input);
        int[] expectArray = new int[]{8, 7, 6, 5, 4, 3};
        assertThat(resultArray, is(expectArray));
    }
}