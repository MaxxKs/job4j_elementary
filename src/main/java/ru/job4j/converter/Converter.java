package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static float euroToDollar(float value) {
        float result = value * 1.167F;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.857F;
        return result;
    }

    public static void main(String[] args) {
        float rubEur = rubleToEuro(140);
        System.out.println("140 rubles are " + rubEur + " euro.");
        float eurRub = euroToRuble(2);
        System.out.println("2 euro are " + eurRub + " rubles.");
        float rubUsd = rubleToDollar(120);
        System.out.println("120 rubles are " + rubUsd + " dollar.");
        float usdRub = dollarToRuble(2);
        System.out.println("2 dollar are " + usdRub + " rubles.");
        float eurUsd = euroToDollar(20);
        System.out.println("20 euro are " + eurUsd + " dollar.");
        float usdEur = dollarToEuro(20);
        System.out.println("20 dollar are " + usdEur + " euro.");
    }
}
