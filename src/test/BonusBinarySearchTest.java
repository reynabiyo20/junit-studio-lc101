package test;
import main.BalancedBrackets;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



public class BonusBinarySearchTest {
@Test
    public void testToNumbers() {
    int[] test = {};
    int retVal = 500;

    retVal = BonusBinarySearch.binarySearch(test, retVal);
    assertEquals(-1, retVal, 0);

}

    @Test
    public void testNumbersInArray() {
        int[] test = {500};
        int retVal = 500;

        retVal = BonusBinarySearch.binarySearch(test, retVal);
        assertEquals(0, retVal, 0);

    }

    @Test
    public void testNumbersNotInArray() {
        int[] test = {1,2,3,4};
        int retVal = 500;

        retVal = BonusBinarySearch.binarySearch(test, retVal);
        assertEquals(-1, retVal, 0);

    }

}
