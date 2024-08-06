package ru.job4j.condition;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15To7Then15() {
        int left = 15;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To15Then15() {
        int left = 7;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}