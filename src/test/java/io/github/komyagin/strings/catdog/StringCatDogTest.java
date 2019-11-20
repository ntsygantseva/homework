package io.github.komyagin.strings.catdog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCatDogTest {

    //GIVEN
    StringCatDog stringCatDog = new StringCatDog();

    @Test
    public void shouldReturnTrueCaseOne() {
        //WHEN
        boolean expected = true;
        boolean actual = stringCatDog.catDog("catdog");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueCaseTwo() {
        //WHEN
        boolean expected = true;
        boolean actual = stringCatDog.catDog("1cat1cadodog");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueCaseThree() {
        //WHEN
        boolean expected = true;
        boolean actual = stringCatDog.catDog("catxdogxdogxcat");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseOne() {
        //WHEN
        boolean expected = false;
        boolean actual = stringCatDog.catDog("catcat");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseTwo() {
        //WHEN
        boolean expected = false;
        boolean actual = stringCatDog.catDog("catxxdogxxxdog");

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseCaseThree() {
        //WHEN
        boolean expected = false;
        boolean actual = stringCatDog.catDog("catxdogxdogxca");

        //THEN
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPEWhenArgumentIsNull() {

        //WHEN
        boolean expected = true;
        boolean actual = stringCatDog.catDog(null);

        //THEN
        assertEquals(expected, actual);
    }
}