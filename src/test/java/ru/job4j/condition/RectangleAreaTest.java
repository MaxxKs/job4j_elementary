package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expendet = 2;
        double p = 6;
        double k = 2;
        double output = RectangleArea.square(p,k);
        assertThat(output).isEqualTo(expendet, withPrecision(0.01));
    }

    @Test
    void whenP20K12Square7dot10() {
        float expendet = 7.10F;
        double p = 20;
        double k = 12;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expendet, withPrecision(0.01));
    }

    @Test
    void whenP23K14Squar8dot22() {
        float expendet = 8.22F;
        double p = 23;
        double k = 14;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expendet, withPrecision(0.01));
    }

    @Test
    void whenP23K14Squar13dot92() {
        float expendet = 13.92F;
        double p = 27;
        double k = 11;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expendet, withPrecision(0.01));
    }
}