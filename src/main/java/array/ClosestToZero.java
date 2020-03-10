
package array;

import java.util.Arrays;

/**
 * @author rahul.kumar
 * @version $Id: ClosestToZero.java, v 0.1 2020-02-07 01:05 rahul.kumar Exp $$
 */
public class ClosestToZero {

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};

        getClosestToZero(arr);

    }


    public static void getClosestToZero(int[] arr) {

        int min_sum = Integer.MAX_VALUE;
        int sum;


        if (arr.length == 2) {

            System.out.println("invalid input");

        }

        Arrays.sort(arr);

        int arrLength = arr.length;

        int i = 0;

        int j = arrLength - 1;

        int min_l = i, min_r = j - 1;

        while (i < j) {

            sum = arr[i] + arr[j];
            if (Math.abs(sum) < Math.abs(min_sum)) {

                min_sum = sum;

                min_l = i;
                min_r = j;
            }

            if (sum < 0) {
                i++;
            } else j--;
        }


        System.out.println("output is " + arr[min_l] + " :" + arr[min_r]);
    }
}