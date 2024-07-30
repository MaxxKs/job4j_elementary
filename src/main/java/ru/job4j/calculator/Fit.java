package ru.job4j.calculator;

public class Fit {
    private static final int MAN_OFFSET = 100;
    private static final int WOMAN_OFFSET = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    public static double manWeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - MAN_OFFSET) * WEIGHT_FACTOR;
    }

    public static double womanWeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - WOMAN_OFFSET) * WEIGHT_FACTOR;
    }

    public static void main(String[] args) {
        int manHeight = 187;
        int womanHeight = 175;

        double manWeight = manWeight(manHeight);
        System.out.println("Ideal weight for men with height " + manHeight + " cm is " + manWeight + " kg");

        double womanWeight = womanWeight(womanHeight);
        System.out.println("Ideal weight for women with height " + womanHeight + " cm is " + womanWeight + " kg");
    }
}
