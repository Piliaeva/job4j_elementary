package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[] {1, 4, 0, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[] {10, 0, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortSame() {
        int[] data = new int[] {0, 8, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }
}