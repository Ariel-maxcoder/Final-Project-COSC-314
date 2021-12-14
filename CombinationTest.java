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
        assertEquals(true,com.ComArr(arr,data,5,2,3,3)==0);

    }
}
