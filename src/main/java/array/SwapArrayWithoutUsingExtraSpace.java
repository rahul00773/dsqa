
package array;

/**
 * @author rahul.kumar
 * @version $Id: SwapArrayWithoutUsingExtraSpace.java, v 0.1 2020-02-05 00:40 rahul.kumar Exp $$
 */
public class SwapArrayWithoutUsingExtraSpace {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};

        swapArray(arr);
        for(int i = 0; i<arr.length; i++){

            System.out.println(arr[i]);
        }
    }

    public static void swapArray(int[] arr){

        int i =0;
        int j = arr.length-1;
        while (i<j){

          int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;

        }
    }

}