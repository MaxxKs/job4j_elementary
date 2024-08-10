package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish5Sum15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish10Sum55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8Sum33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart12Finish8Sum0() {
        int start = 12;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart4Finish13Sum0() {
        int start = 4;
        int finish = 13;
        int result = Counter.sum(start, finish);
        int expected = 85;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Sum2() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish7Sum2() {
        int start = 1;
        int finish = 7;
        int result = Counter.sum(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }
}