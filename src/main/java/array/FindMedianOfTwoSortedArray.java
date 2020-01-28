
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMedianOfTwoSortedArray.java, v 0.1 2020-01-28 22:42 rahul.kumar Exp $$
 */
public class FindMedianOfTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};

        System.out.println(getMedianOfSortedArray(arr1, arr2));


    }

    public static double getMedianOfSortedArray(int[] arr1, int[] arr2) {


        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];

        }

        while (i < n1) {
            arr3[k++] = arr1[i++];

        }

        while (j < n2) {
            arr3[k++] = arr2[j++];

        }


        int nlenght = arr3.length;
        double median = 0.0;
        if (nlenght % 2 == 0) {

            median = (arr3[(nlenght / 2) - 1] + arr3[nlenght / 2]) / 2.0;

        } else {
            median = arr3[(nlenght + 1) / 2 - 1];

        }

        return median;

    }
}