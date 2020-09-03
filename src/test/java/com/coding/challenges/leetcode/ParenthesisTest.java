package com.coding.challenges.leetcode;

import org.junit.Test;

import java.util.List;

import static com.coding.challenges.leetcode.Parenthesis.generateParenthesis;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParenthesisTest {

    @Test
    public void generateParenthesisTest() {
        List<String> parenthesis = generateParenthesis(3);
        assertTrue(parenthesis.contains("((()))"));
        assertTrue(parenthesis.contains("(()())"));
        assertTrue(parenthesis.contains("(())()"));
        assertTrue(parenthesis.contains("()(())"));
        assertTrue(parenthesis.contains("()()()"));
        assertEquals(5, parenthesis.size());
    }
}