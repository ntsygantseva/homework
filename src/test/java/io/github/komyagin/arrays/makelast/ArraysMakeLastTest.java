package io.github.komyagin.arrays.makelast;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysMakeLastTest {

    //GIVEN
    ArraysMakeLast arraysMakeLast = new ArraysMakeLast();

    @Test
    public void shouldReturnRightNewArrayCaseOne() {
        //GIVEN
        int[] nums = {4, 5, 6};

        //WHERE
        int[] expected = {0, 0, 0, 0, 0, 6};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseTwo() {
        //GIVEN
        int[] nums = {1, 2};

        //WHERE
        int[] expected = {0, 0, 0, 2};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseThree() {
        //GIVEN
        int[] nums = {3};

        //WHERE
        int[] expected = {0, 3};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseFour() {
        //GIVEN
        int[] nums = {0};

        //WHERE
        int[] expected = {0, 0};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseFive() {
        //GIVEN
        int[] nums = {7, 7, 7};

        //WHERE
        int[] expected = {0, 0, 0, 0, 0, 7};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnNPEWhenArrayIsNull() {
        //GIVEN
        int[] nums = null;

        //WHERE
        int[] expected = {0, 0, 0, 0, 0, 7};
        int[] actual = arraysMakeLast.makeLast(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

}