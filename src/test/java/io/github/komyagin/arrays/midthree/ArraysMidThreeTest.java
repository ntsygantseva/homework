package io.github.komyagin.arrays.midthree;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysMidThreeTest {

    //GIVEN
    ArraysMidThree arraysMidThree = new ArraysMidThree();

    @Test
    public void shouldReturnRightNewArrayCaseOne() {
        //GIVEN
        int[] nums = {1, 2, 3, 4, 5};

        //GIVEN
        int[] expected = {2, 3, 4};
        int[] actual = arraysMidThree.midThree(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseTwo() {
        //GIVEN
        int[] nums = {8, 6, 7, 5, 3, 0, 9};

        //GIVEN
        int[] expected = {7, 5, 3};
        int[] actual = arraysMidThree.midThree(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseThree() {
        //GIVEN
        int[] nums = {1, 2, 3};

        //GIVEN
        int[] expected = {1, 2, 3};
        int[] actual = arraysMidThree.midThree(nums);

        //THEN
        assertArrayEquals(expected, actual);
    }
}