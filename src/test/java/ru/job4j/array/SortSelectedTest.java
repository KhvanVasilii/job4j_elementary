package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = {5, 10, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 5, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5Then13579() {
        int[] data = new int[] {3, 7, 1, 9, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}