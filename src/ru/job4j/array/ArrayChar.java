package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        char n = 0;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[n]) {
                result = false;
            } else {
                n = +1;
            }
        }
        return result;
    }
}