package com.java2novice.junit.tests;
import static org.junit.Assert.assertEquals;

import com.java2novice.junit.samples.Combination;
import org.junit.Test;

public class CombinationTest {

    @Test
    public void testCombination()
    {
        Combination com = new Combination();
        int arr[] = {1, 2, 3, 4};
        int data[] = {1, 2, 3, 4};
        //assertEquals(true,com.ComArr(arr,data,4,,0,2));

        //This returns the the num which shows that it is counting for the limit of combinations hence
        //"num == r" in the Combination class
        assertEquals(true,com.ComArr(arr,data,6,3,4,4)==0);

    }
}
