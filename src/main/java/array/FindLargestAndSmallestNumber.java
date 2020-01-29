
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindLargestAndSmallestNumber.java, v 0.1 2020-01-30 00:06 rahul.kumar Exp $$
 */
public class FindLargestAndSmallestNumber {

    public static void main(String[] args) {

        int[] arr = {12, 1, 6, 3, 2, 8, 4, 5, 10, 20, 21};

        int[] ans = getLargestAndSmallest(arr);


        System.out.println("Min Element is " + ans[0]);
        System.out.println("Max Element is " + ans[1]);


    }

    public static int[] getLargestAndSmallest(int[] arr) {

        int[] ans = new int[2];

        int minElement = arr[0];
        int maxElement = arr[1];

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] < minElement) {
                minElement = arr[i];

            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        ans[0] = minElement;

        ans[1] = maxElement;

        return ans;


    }
}