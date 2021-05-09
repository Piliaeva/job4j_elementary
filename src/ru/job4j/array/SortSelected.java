package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i >= data.length - i; i++) {
            int min = MinDiapason.findMin(data, i, data.length - i);
            int index = FindLoop.indexOf(data, min, i, data.length - i);
            int bag = data[i];
            data[i] = min;
            data[index] = bag;  }

        return data;
    }
}