
package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: InsertionSort.java, v 0.1 2020-02-10 23:58 rahul.kumar Exp $$
 */

/**
 * Insertion Sort - Like playing card- Pick a number . Place it on it right position
 */
public class InsertionSort {

    public static void main(String[] args){

        int[] arr = new int[]{5,3,2,1,5};
        doInsertionSort(arr);

        for( int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void doInsertionSort(int[] arr){
        int key,j;
        for (int i =1; i<arr.length; i++){

             key = arr[i];
             j =i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;

            }

            arr[j+1] =key;
        }

    }
}