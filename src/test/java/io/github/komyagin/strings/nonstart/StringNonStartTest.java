package io.github.komyagin.strings.nonstart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringNonStartTest {

    @Test
    public void shouldReturnRightConcatenationFirstCase() {
        StringNonStart stringNonStart = new StringNonStart();

        String expected = "ellohere";
        String actual = stringNonStart.nonStart("Hello", "There");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationSecondCase() {
        StringNonStart stringNonStart = new StringNonStart();

        String expected = "avaode";
        String actual = stringNonStart.nonStart("java", "code");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightConcatenationThirdCase() {
        StringNonStart stringNonStart = new StringNonStart();

        String expected = "hotlava";
        String actual = stringNonStart.nonStart("shotl", "java");

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