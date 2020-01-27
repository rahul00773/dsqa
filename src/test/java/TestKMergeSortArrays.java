

import array.MergeNSortedArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author rahul.kumar
 * @version $Id: TestKMergeSortArrays.java, v 0.1 2020-01-28 00:27 rahul.kumar Exp $$
 */
public class TestKMergeSortArrays {

    MergeNSortedArray mergeNSortedArray = new MergeNSortedArray();

    @Test
    public void  testKSortedArray(){

        int[][] input  ={{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }};
        mergeNSortedArray.mergeKSortedArrays(input);

        int [] output = mergeNSortedArray.mergeKSortedArrays(input);

        int[] expectedOutput = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(output));
        Assert.assertEquals(Arrays.toString(expectedOutput),
                Arrays.toString(output));
    }
}