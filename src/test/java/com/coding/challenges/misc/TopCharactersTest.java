package com.coding.challenges.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopCharactersTest {

    private final TopCharacters topChars = new TopCharacters();

    @Test
    public void getTopCharacters1() {
        assertEquals("l", topChars.getTopCharacters("Hello World, 101!"));
    }

    @Test
    public void getTopCharacters2() {
        assertEquals("", topChars.getTopCharacters("Madam"));
    }

    @Test
    public void getTopCharacters3() {
        String text = "To us on Earth, the sun is a smiling orange-yellow circle among the cottony clouds. But the fiery\n" +
                "ball of fire out in space is so much more than that. The Sun is the star, the center of our solar\n" +
                "system. It is the most important source of energy for life on earth. With its humongous size and\n" +
                "heavy composition of chemicals, this blazing star has a magnified gravitational force, compelling\n" +
                "all the planets, including the earth to revolve around it. Due to its importance in our lives, man\n" +
                "since prehistoric times has considered it a deity and I personally believe it is nothing less than\n" +
                "that.";
        assertEquals("et", topChars.getTopCharacters(text));
    }

    @Test
    public void getTopCharacters4() {
        assertEquals("", topChars.getTopCharacters("abc"));
    }

    @Test
    public void getTopCharacters5() {
        assertEquals("abc", topChars.getTopCharacters("abc abc abc def ghi jkl mno pqr stu vwx yz"));
    }

    @Test
    public void getTopCharacters6() {
        assertEquals("oeh", topChars.getTopCharacters("The quick brown fox jumps over the lazy dog"));
    }
}