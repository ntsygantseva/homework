package io.github.komyagin.strings.nonstart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringNonStartTest {

    @Test
    public void shouldReturnRightConcatenationFirstCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "ellohere";
        String actual = stringNonStart.nonStart("Hello", "There");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSecondCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "avaode";
        String actual = stringNonStart.nonStart("java", "code");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationThirdCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "hotlava";
        String actual = stringNonStart.nonStart("shotl", "java");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationFourthCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "by";
        String actual = stringNonStart.nonStart("ab", "xy");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationFifthCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "b";
        String actual = stringNonStart.nonStart("ab", "x");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSixthCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "c";
        String actual = stringNonStart.nonStart("x", "ac");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSeventhCase() {
        //GIVEN
        StringNonStart stringNonStart = new StringNonStart();

        //WHEN
        String expected = "";
        String actual = stringNonStart.nonStart("a", "x");

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPE() {
        StringNonStart stringNonStart = new StringNonStart();

        String expected = "ellohere";
        String actual = stringNonStart.nonStart(null, null);

        assertEquals(expected, actual);
    }

}