package com.javacodetest;

import javacodetest.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testSort() {
        Integer[] asc = solution.sort(true);
        Assert.assertTrue(asc[0] == 2);
    }
}