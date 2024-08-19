package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number <= 1) {
            System.out.println(number + " не является простым числом");
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " не является простым числом");
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(number + " является простым числом");
        }
        return prime;
    }
}
