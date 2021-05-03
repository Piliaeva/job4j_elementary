package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
                       int temp = array[0];
                array[0] = array[array.length - 1];
                array[array.length - 1] = temp;
                if (array.length >= 4) {
            for (int index = 1; index < array.length; index++) {
                int templ = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = templ;
            }
            }
        return array;
    }
}
