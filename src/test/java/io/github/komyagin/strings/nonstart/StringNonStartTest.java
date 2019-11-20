package io.github.komyagin.strings.nonstart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringNonStartTest {

    //GIVEN
    StringNonStart stringNonStart = new StringNonStart();

    @Test
    public void shouldReturnRightConcatenationFirstCase() {

        //WHEN
        String expected = "ellohere";
        String actual = stringNonStart.nonStart("Hello", "There");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSecondCase() {

        //WHEN
        String expected = "avaode";
        String actual = stringNonStart.nonStart("java", "code");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationThirdCase() {

        //WHEN
        String expected = "hotlava";
        String actual = stringNonStart.nonStart("shotl", "java");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationFourthCase() {

        //WHEN
        String expected = "by";
        String actual = stringNonStart.nonStart("ab", "xy");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationFifthCase() {

        //WHEN
        String expected = "b";
        String actual = stringNonStart.nonStart("ab", "x");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSixthCase() {

        //WHEN
        String expected = "c";
        String actual = stringNonStart.nonStart("x", "ac");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringSeventhCase() {

        //WHEN
        String expected = "";
        String actual = stringNonStart.nonStart("a", "x");

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArgumentsAreNull() {

        String expected = "ellohere";
        String actual = stringNonStart.nonStart(null, null);

        assertEquals(expected, actual);
    }

}