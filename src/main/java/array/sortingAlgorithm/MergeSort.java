package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: MergeSort.java, v 0.1 2020-02-10 23:59 rahul.kumar Exp $$
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array"); 
        printArray(arr);
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array"); 
        printArray(arr); 
    }


     void doMergeSort(int[] arr, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            doMergeSort(arr, p, q);
            doMergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }


    }


    static  void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int i, j;
        for (i = 0; i < n1; i++) {
            arr1[i] = arr[p + i];
        }

        for (j = 0; j < n2; j++) {

            arr2[j] = arr[q + 1 + j];

        }
        int k = p;
         i = 0;
         j = 0;


        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }

       //  Copy remaining elements of R[] if any
        while (j < n2)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }



    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}