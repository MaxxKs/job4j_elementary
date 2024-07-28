package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3016To184Then16dot97() {
        double expected = 16.97;
        int x1 = 30;
        int y1 = 16;
        int x2 = 18;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when6Minus6To1026Then20dot39() {
        double expected = 32.24;
        int x1 = 6;
        int y1 = -6;
        int x2 = 10;
        int y2 = 26;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when212To3421Then23dot02() {
        double expected = 23.02;
        int x1 = 21;
        int y1 = 2;
        int x2 = 34;
        int y2 = 21;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}