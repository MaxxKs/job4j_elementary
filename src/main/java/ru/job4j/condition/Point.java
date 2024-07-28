package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return result;
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0): " + result1);
        double result2 = distance(8, 6, 4, 2);
        System.out.println("result (8, 6) to (4, 2): " + result2);
        double result3 = distance(10, 26, 6, 6);
        System.out.println("result (10, 26) to (6, 6): " + result3);
        double result4 = distance(30, 16, 18, 4);
        System.out.println("result (30, 16) to (18, 4): " + result4);
    }
}
