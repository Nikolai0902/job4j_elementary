package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(8, 4, 2);
        assertThat(result, is(8));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(8, 10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(8, 10, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(8, 8, 8);
        assertThat(result, is(8));
    }
}