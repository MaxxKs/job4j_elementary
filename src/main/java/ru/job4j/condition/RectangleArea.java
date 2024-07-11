package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double s = h * k * h;
        return s;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println("p = 4, k = 1, s = " + result);
        double result1 = square(6, 2);
        System.out.println("p = 6, k = 2, s = " + result1);
    }
}
