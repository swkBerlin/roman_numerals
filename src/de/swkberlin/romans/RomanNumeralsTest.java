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


    @Test
    public void shouldIVfor4() {
        assertEquals("IV", convert(4));
    }

    @Test
    public void shouldIXfor9() {
        assertEquals("IX", convert(9));
    }

    @Test
    public void shouldXXIXfor29() {
        assertEquals("XXIX", convert(29));
    }


    @Test
    public void shouldLfor50() {
        assertEquals("L", convert(50));
    }

    @Test
    public void shouldMfor1000() {
        assertEquals("M", convert(1000));
    }

    @Test
    public void shouldDfor500() {
        assertEquals("D", convert(500));
    }

    @Test
    public void shouldCfor100() {
        assertEquals("C", convert(100));
    }

    @Test
    public void shouldXCfor90() {
        assertEquals("XC", convert(90));
    }

    @Test
    public void shouldMCMXCIXfor1999() {
        assertEquals("MCMXCIX", convert(1999));
    }

}
