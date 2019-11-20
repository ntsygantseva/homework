package io.github.komyagin.arrays.lucky13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysLuckyThirteenTest {
    //GIVEN
    ArraysLuckyThirteen arraysLuckyThirteen = new ArraysLuckyThirteen();

    @Test
    public void shouldReturnTrueCaseOne() {
        //GIVEN
        int[] nums = {0, 2, 4};

        //WHERE
        boolean expected = true;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueCaseTwo() {
        //GIVEN
        int[] nums = {2, 7, 2, 8};

        //WHERE
        boolean expected = true;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueCaseThree() {
        //GIVEN
        int[] nums = {2, 2};

        //WHERE
        boolean expected = true;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueWhereArrayIsEmptyCaseFour() {
        //GIVEN
        int[] nums = {};

        //WHERE
        boolean expected = true;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseOne() {
        //GIVEN
        int[] nums = {1, 2, 3};

        //WHERE
        boolean expected = false;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseTwo() {
        //GIVEN
        int[] nums = {1, 2, 4};

        //WHERE
        boolean expected = false;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseThree() {
        //GIVEN
        int[] nums = {3};

        //WHERE
        boolean expected = false;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArrayIsNull() {
        //GIVEN
        int[] nums = null;

        //WHERE
        boolean expected = false;
        boolean actual = arraysLuckyThirteen.lucky13(nums);

        //THEN
        assertEquals(expected, actual);
    }

}