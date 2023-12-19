package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testBalancedWithOtherChars() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testUnbalancedWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("L]aunchCode["));
    }

    @Test
    public void testOnlyOneOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testOnlyOneCloseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testOneOpenBracketWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }

    @Test
    public void testOneCloseBracketWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }
    @Test
    public void testUnbalancedThreeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launc]["));
    }
    @Test
    public void testMultipleBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][]"));
    }

}
