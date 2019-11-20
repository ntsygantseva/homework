package io.github.komyagin.strings.bobthere;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBobThereTest {

    //GIVEN
    StringBobThere stringBobThere = new StringBobThere();

    @Test
    public void shouldReturnTrueFirstCase() {

        //WHEN
        boolean expected = true;
        boolean actual = stringBobThere.bobThere("abcbob");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueSecondCase() {

        //WHEN
        boolean expected = true;
        boolean actual = stringBobThere.bobThere("b9b");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueThirdCase() {

        //WHEN
        boolean expected = true;
        boolean actual = stringBobThere.bobThere("bbb");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueFourthCase() {

        //WHEN
        boolean expected = true;
        boolean actual = stringBobThere.bobThere("123abcbcdbabxyz");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseFirstCase() {

        //WHEN
        boolean expected = false;
        boolean actual = stringBobThere.bobThere("bac");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseSecondCase() {

        //WHEN
        boolean expected = false;
        boolean actual = stringBobThere.bobThere("abcdefb");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseThirdCase() {

        //WHEN
        boolean expected = false;
        boolean actual = stringBobThere.bobThere("b12");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseFourthCase() {

        //WHEN
        boolean expected = false;
        boolean actual = stringBobThere.bobThere("bbc");

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArgumentIsNull() {

        //WHEN
        boolean expected = true;
        boolean actual = stringBobThere.bobThere(null);

        //THEN
        assertEquals(expected, actual);
    }

}