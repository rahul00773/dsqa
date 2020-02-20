package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: MergeSort.java, v 0.1 2020-02-10 23:59 rahul.kumar Exp $$
 */
public class MergeSort {


    public static void main(String[] args) {


        int[] arr = new int[]{5, 3, 2, 1, 5};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public void doMergeSort(int[] arr, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            doMergeSort(arr, p, q);
            doMergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }


    }


    void merge(int[] arr, int p, int q, int r) {


        int n1 = q - p + 1;
        int n2 = r - q;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int i, j;
        for (i = 0; i < n1; ++i) {

            arr1[i] = arr[p + i];
        }

        for (j = 0; j < n2; ++j) {

            arr2[j] = arr[q + 1 + j];

        }

        //   arr1[i] = Integer.MAX_VALUE;
        //  arr2[j] = Integer.MAX_VALUE;

        int k = 0;

        int l = 0, ri = 0;

        while (l < n1 && ri < n2) {

            if (arr1[l] <= arr2[ri]) {

                arr[k] = arr1[l];

                l++;
            } else {
                arr[k] = arr2[ri];
                ri++;
            }

            k++;
        }

       /* while (l < n1)
        {
            arr[k] = arr1[l];
            l++;
            k++;
        }

       //  Copy remaining elements of R[] if any
        while (ri < n2)
        {
            arr[k] = arr2[ri];
            ri++;
            k++;
        }*/

    }

}