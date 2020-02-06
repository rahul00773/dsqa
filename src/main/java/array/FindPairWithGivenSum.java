
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindPairWithGivenSum.java, v 0.1 2020-02-07 00:46 rahul.kumar Exp $$
 */
public class FindPairWithGivenSum {

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 6;
        printPair(arr, sum);

    }

    public static void printPair(int[] arr, int sum) {
        int count = 0;
        int i = 0;

        int j = arr.length - 1;


        while (i < j) {

            if (arr[i] + arr[j] > sum) {
                j--;
            } else if (arr[i] + arr[j] < sum) {

                i++;
            } else {
                System.out.println("combination is" + arr[i] + "," + arr[j]);
                i++;
                count++;
            }
        }

        System.out.println("Total count of pair is : " + count);
    }
}