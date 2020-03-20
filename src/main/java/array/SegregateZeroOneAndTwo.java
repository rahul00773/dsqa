
package array;

/**
 * @author rahul.kumar
 * @version $Id: SegregateZeroOneAndTwo.java, v 0.1 2020-02-03 00:17 rahul.kumar Exp $$
 */
public class SegregateZeroOneAndTwo {


    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2};
        segregateZeroOneAndTwo(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void segregateZeroOneAndTwo(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high) {

            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2: {
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
                }

            }


        }


    }


}