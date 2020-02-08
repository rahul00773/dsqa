
package array;
import java.util.*;

/**
 * @author rahul.kumar
 * @version $Id: FindMinimumDifferenceBetweenTwoElements.java, v 0.1 2020-02-07 23:01 rahul.kumar Exp $$
 */
public class FindMinimumDifferenceBetweenTwoElements {



    private static final int MAX = 100001;
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4,4};

        System.out.println(getMinimumDifference(arr));


    }

    public static int getMinimumDifference(int[] arr){

        int[] freq = new int[MAX];

        for(int i = 0; i < arr.length-1; i++)

        {
            freq[i] = 0;

        }

        for (int i = 0; i < arr.length-1; i++)

        {

            // Update the frequency of current element

            freq[arr[i]]++;


            // If current element appears more than once

            // then the minimum absolute difference

            // will be 0 i.e. |arr[i] - arr[i]|

            if (freq[arr[i]] > 1)

                return 0;

        }

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < MAX; i++)

        {

            if (freq[i] > 0)

            {

                i++;

                int cnt = 1;

                while ((freq[i] == 0) && (i != MAX - 1))

                {

                    cnt++;

                    i++;

                }

                mn = Math.min(cnt, mn);

                i--;

            }

        }



        return mn;



    }
}