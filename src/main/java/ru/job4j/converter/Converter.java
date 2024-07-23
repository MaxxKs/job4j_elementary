package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static float euroToDollar(float value) {
        return value * 1.167F;
    }

    public static float dollarToEuro(float value) {
        return value * 0.857F;
    }

    public static void main(String[] args) {
        float rubEur = rubleToEuro(140);
        float inputRubEur = 140;
        float expectedRubEur = 2;
        float outputRubEur = rubleToEuro(inputRubEur);
        boolean passedRubEur = expectedRubEur == outputRubEur;
        System.out.println("140 rubles are " + rubEur + " euro. Test result : " + passedRubEur);
        float eurRub = euroToRuble(2);
        float inputEurRub = 2;
        float expectedEurRub = 140;
        float outputEurRub = euroToRuble(inputEurRub);
        boolean passedEurRub = expectedEurRub == outputEurRub;
        System.out.println("2 euro are " + eurRub + " rubles. Test result : " + passedEurRub);
        float rubUsd = rubleToDollar(120);
        float inpetRubUsd = 120;
        float expectedRubUsd = 2;
        float outputRubUsd = rubleToDollar(inpetRubUsd);
        boolean passedRubUsd = expectedRubUsd == outputRubUsd;
        System.out.println("120 rubles are " + rubUsd + " dollar. Test result: " + passedRubUsd);
        float usdRub = dollarToRuble(2);
        float inputUsdRub = 2;
        float expectedUsdRub = 120;
        float outputUsdRub = dollarToRuble(inputUsdRub);
        boolean passedUsdRub = expectedUsdRub == outputUsdRub;
        System.out.println("2 dollar are " + usdRub + " rubles. Test result: " + passedUsdRub);
        float eurUsd = euroToDollar(1000);
        float inputEurUsd = 1000;
        float expecedEurUsd = 1167;
        float outputEurUsd = euroToDollar(inputEurUsd);
        boolean passedEurUsd = expecedEurUsd == outputEurUsd;
        System.out.println("1000 euro are " + eurUsd + " dollar. Test result: " + passedEurUsd);
        float usdEur = dollarToEuro(1000);
        float inputUsdEur = 1000;
        float expectedUsdEur = 857;
        float outputUsdEur = dollarToEuro(inputUsdEur);
        boolean passedUsdEur = expectedUsdEur == outputUsdEur;
        System.out.println("1000 dollar are " + usdEur + " euro. Test result: " + passedUsdEur);
    }
}