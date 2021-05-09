package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) { //10 5 3
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
        }
        return min;
    }
}