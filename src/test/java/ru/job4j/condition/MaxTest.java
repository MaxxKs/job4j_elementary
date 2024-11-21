package ru.job4j.condition;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max maximum = new Max();
        int left = 1;
        int right = 2;
        int result = maximum.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15To7Then15() {
        Max maximum = new Max();
        int left = 15;
        int right = 7;
        int result = maximum.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To15Then15() {
        Max maximum = new Max();
        int left = 7;
        int right = 15;
        int result = maximum.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        Max maximum = new Max();
        int left = 7;
        int right = 7;
        int result = maximum.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax14To15To16Then16() {
        Max maximum = new Max();
        int first = 14;
        int second = 15;
        int third = 16;
        int result = maximum.max(first, second, third);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax20To100To10To1000Then1000() {
        Max maximum = new Max();
        int first = 20;
        int second = 100;
        int third = 10;
        int fourth = 1000;
        int result = maximum.max(first, second, third, fourth);
        int expected = 1000;
        assertThat(result).isEqualTo(expected);
    }
}
