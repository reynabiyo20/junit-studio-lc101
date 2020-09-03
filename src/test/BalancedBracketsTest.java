package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testNoBrackets() {
        String test = "";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void onlyBrackets() {
        String test = "[]";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void testCloseBracket() {
        String test = "]";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void testOpenBracket() {
        String test = "[";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
        public void test1Brackets() {
            String test = "[";
            boolean retVal = true;

            retVal = BalancedBrackets.hasBalancedBrackets(test);
            assertFalse(retVal);
        }

    @Test
    public void testBracketsOrder() {
        String test = "][";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    @Test
    public void testBCharactersAndBrackets() {
        String test = "ab[123]";
        boolean retVal = false;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertTrue(retVal);
    }

    @Test
    public void testCharsAndReversedBrackets() {
        String test = "aBc]1k[";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }

    public void testCharsAndROneBracket() {
        String test = "aBc]12k";
        boolean retVal = true;

        retVal = BalancedBrackets.hasBalancedBrackets(test);
        assertFalse(retVal);
    }


}
