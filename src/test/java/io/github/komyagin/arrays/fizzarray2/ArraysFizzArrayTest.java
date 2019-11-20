package io.github.komyagin.arrays.fizzarray2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraysFizzArrayTest {
    //GIVEN
    ArraysFizzArray arraysFizzArray = new ArraysFizzArray();

    @Test
    public void shouldReturnRightNewArrayCaseOne() {
        //WHEN
        String[] expected = {"0", "1", "2", "3"};
        String[] actual = arraysFizzArray.fizzArray2(4);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseTwo() {
        //WHEN
        String[] expected = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] actual = arraysFizzArray.fizzArray2(10);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseThree() {
        //WHEN
        String[] expected = {"0", "1"};
        String[] actual = arraysFizzArray.fizzArray2(2);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseFour() {
        //WHEN
        String[] expected = {"0"};
        String[] actual = arraysFizzArray.fizzArray2(1);

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightNewArrayCaseFive() {
        //WHEN
        String[] expected = {};
        String[] actual = arraysFizzArray.fizzArray2(0);

        //THEN
        assertArrayEquals(expected, actual);
    }
}