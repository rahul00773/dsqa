
package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: QuickSort.java, v 0.1 2020-02-10 23:59 rahul.kumar Exp $$
 */

/**
 * Quick Sort is the algorithm in which we sort the element in memory.
 * This algorithm is also and divide and conqure algorithm which is basically like Merge sort
 * In quick sort we choose a number and place it on its right position- and numbers from this numbers to left are smaller then this number
 * and in right number all are greater
 *
 * The main thing in quick sort is partitioning -
 */
public class QuickSort {

    public static void main(String[] args){

        int[] arr ={5,4,3,2,1,8,9,10,6};
        doQuickSort(arr,0,arr.length-1);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void doQuickSort(int[] arr,int p, int r){

        if(p<r) {

            int x = partition(arr, p, r);
            doQuickSort(arr, p, x - 1);
            doQuickSort(arr, x + 1, r);
        }

    }

    public static int partition(int[] arr,int p, int r){

        int x = arr[r]; // Taken Pivot for this
        int i = p-1;
       // int j = arr[0];

        for (int j = p; j<= r-1; j++){
            if(arr[j]<=x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;


        return i+1;

    }

}