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
    public void testOnlyOneLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testOnlyOneRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testOneLeftBracketWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }

    @Test
    public void testOneRightBracketWithOtherChars() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }
}
