package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert2EuroThen140Rbl() {
        float input = 2;
        float expected = 140;
        float output = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert120RblThen2Dollar() {
        float input = 120;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert2DollarThen120Rbl() {
        float input = 2;
        float expected = 120;
        float output = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert1000EuroThen1167Dollar() {
        float input = 1000;
        float expected = 1167;
        float output = Converter.euroToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));

    }

    @Test
    void whenConvert1000DollarThen857Euro() {
        float input = 1000;
        float expected = 857;
        float output = Converter.dollarToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}