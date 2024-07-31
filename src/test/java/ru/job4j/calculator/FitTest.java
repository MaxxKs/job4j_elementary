package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan187Then100dot05() {
        short input = 187;
        double expected = 100.05;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman175Then74dot75() {
        short input = 175;
        double expected = 74.75;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenNegativeHeightThenException() {
        short input = -180;
        assertThatThrownBy(() -> Fit.manWeight(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Height must be positive");
    }

    @Test
    void whenZeroHeightThenException() {
        short input = 0;
        assertThatThrownBy(() -> Fit.womanWeight(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Height must be positive");
    }
}
