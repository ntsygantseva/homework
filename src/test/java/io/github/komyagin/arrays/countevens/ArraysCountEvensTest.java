package io.github.komyagin.arrays.countevens;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysCountEvensTest {
    //GIVEN
    ArraysCountEvens arraysCountEvens = new ArraysCountEvens();

    @Test
    public void shouldReturnRightCountOfEvensCaseOne() {
        //GIVEN
        int[] nums = {2, 1, 2, 3, 4};

        //WHERE
        int expected = 3;
        int actual = arraysCountEvens.countEvens(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountOfEvensCaseTwo() {
        //GIVEN
        int[] nums = {2, 2, 0};

        //WHERE
        int expected = 3;
        int actual = arraysCountEvens.countEvens(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountOfEvensCaseThree() {
        //GIVEN
        int[] nums = {1 , 3, 5};

        //WHERE
        int expected = 0;
        int actual = arraysCountEvens.countEvens(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountOfEvensWhereArrayIsEmptyCaseFour() {
        //GIVEN
        int[] nums = {};

        //WHERE
        int expected = 0;
        int actual = arraysCountEvens.countEvens(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhereArraysIsNull() {
        //GIVE
        int[] nums = null;

        int expected = 0;
        int actual = arraysCountEvens.countEvens(nums);

        //THEN
        assertEquals(expected, actual);
    }

}