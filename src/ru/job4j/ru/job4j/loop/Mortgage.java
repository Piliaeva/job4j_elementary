package ru.job4j.ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double ostatok = amount + (amount * (percent / 100));
        while (ostatok > 0) {
            ostatok = ostatok - salary;
            year += 1; }
        return year;
    }
}
