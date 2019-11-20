package io.github.komyagin.strings.countcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCountCodeTest {

    // GIVEN
    StringCountCode stringCountCode = new StringCountCode();

    @Test
    public void shouldReturnRightCountFromGivenStringFirstCase() {

        //WHEN
        int expected = 1;
        int actual = stringCountCode.countCode("aaacodebbb");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountFromGivenStringSecondCase() {

        //WHEN
        int expected = 2;
        int actual = stringCountCode.countCode("codexxcode");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountFromGivenStringThirdCase() {

        //WHEN
        int expected = 2;
        int actual = stringCountCode.countCode("cozexxcope");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountFromGivenStringFourthCase() {

        //WHEN
        int expected = 3;
        int actual = stringCountCode.countCode("AAcodeBBcoleCCccoreDD");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountFromGivenStringFifthCase() {

        //WHEN
        int expected = 3;
        int actual = stringCountCode.countCode("coAcodeBcoleccoreDD");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCountFromGivenStringSixthCase() {

        //WHEN
        int expected = 0;
        int actual = stringCountCode.countCode("");

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArgumentIsNull() {

        //WHEN
        int expected = 1;
        int actual = stringCountCode.countCode(null);

        //THEN
        assertEquals(expected, actual);
    }

}