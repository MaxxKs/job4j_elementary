package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        int result = maximum.max(17, 15, 16, 19);
        System.out.println(result);
    }
}