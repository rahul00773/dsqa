
package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: SelectionSort.java, v 0.1 2020-02-10 23:59 rahul.kumar Exp $$
 */

/**
 * In this algorithm one pointer remain fixed and another one is variable. We compare the variable with fixed
 */
public class SelectionSort {

    public static void main(String[] args){

        int[] arr = new int[]{5,3,2,1,5};
        doSelectionSort(arr);

        for( int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void doSelectionSort(int[] arr){

        for (int i =0; i<arr.length-1; i++){


            for (int j =i+1; j<arr.length; j++){

                if(arr[j]<arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}