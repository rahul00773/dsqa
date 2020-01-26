
package array;

/**
 * @author rahul.kumar
 * @version $Id: MergeTwoSortedArray.java, v 0.1 2020-01-26 23:43 rahul.kumar Exp $$
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 7, 9, 12, 18, 22};
        int[] arr2 = {2, 4, 8, 10, 15, 16};

        int[] arr3 = mergeTwoSortedArray(arr1, arr2);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }


    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;


        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {

                arr3[k] = arr1[i];
                i++;

            } else {

                arr3[k] = arr2[j];
                j++;

            }
            k++;

        }


        while (i < n1) {

            arr3[k] = arr1[i];
            i++;
            k++;

        }

        while (j < n2) {

            arr3[k] = arr2[j];
            j++;
            k++;

        }

        return arr3;

    }
}