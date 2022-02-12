package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K3Square2Dot29() {
        int p = 7;
        int k = 3;
        double expected = 2.29;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Square2Dot56() {
        int p = 8;
        int k = 4;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}