package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        first.distance(second);
        double expected = 2;
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3016To184Then16dot97() {
        Point first = new Point(30, 16);
        Point second = new Point(18, 4);
        first.distance(second);
        double expected = 16.97;
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when6Minus6To1026Then20dot39() {
        Point first = new Point(6, -6);
        Point second = new Point(10, 26);
        first.distance(second);
        double expected = 32.24;
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when212To3421Then23dot02() {
        Point first = new Point(21, 2);
        Point second = new Point(34, 21);
        first.distance(second);
        double expected = 23.02;
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }
}