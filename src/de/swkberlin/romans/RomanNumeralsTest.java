package de.swkberlin.romans;

import org.junit.Test;

import static de.swkberlin.romans.RomanNumerals.convert;
import static junit.framework.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void shouldIfor1() {
        assertEquals("I", convert(1));
    }

    @Test
    public void shouldIIfor2() {
        assertEquals("II", convert(2));
    }

    @Test
    public void shouldVfor5() {
        assertEquals("V", convert(5));
    }

    @Test
    public void shouldVIfor6() {
        assertEquals("VI", convert(6));
    }

    @Test
    public void shouldXIfor11() {
        assertEquals("XI", convert(11));
    }

}
