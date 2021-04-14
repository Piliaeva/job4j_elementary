package ru.job4j.ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        int next = 0;
        for (int index = 2; index < number; index++) {
            next = next + index;
            if (number % next == 0) {
                prime = false;
                break;
            } else if (index == next) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}