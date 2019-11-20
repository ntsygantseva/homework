package io.github.komyagin.strings.repeatfront;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringRepeatFrontTest {

    //GIVEN
    StringRepeatFront stringRepeatFront = new StringRepeatFront();

    @Test
    public void shouldReturnExpectedStringFirstCase() {

        //WHEN
        String expected = "ChocChoChC";
        String actual = stringRepeatFront.repeatFront("Chocolate", 4);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnExpectedStringSecondCase() {

        //WHEN
        String expected = "ChoChC";
        String actual = stringRepeatFront.repeatFront("Chocolate", 3);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnExpectedStringThirdCase() {

        //WHEN
        String expected = "IcI";
        String actual = stringRepeatFront.repeatFront("Ice Cream", 2);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnExpectedStringFourthCase() {

        //WHEN
        String expected = "I";
        String actual = stringRepeatFront.repeatFront("Ice Cream", 1);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringFifthCase() {

        //WHEN
        String expected = "";
        String actual = stringRepeatFront.repeatFront("Ice Cream", 0);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringSixthCase() {

        //WHEN
        String expected = "";
        String actual = stringRepeatFront.repeatFront("", 0);

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArgumentIsNull() {

        //WHEN
        String expected = "";
        String actual = stringRepeatFront.repeatFront(null, 1);

        //THEN
        assertEquals(expected, actual);
    }
}