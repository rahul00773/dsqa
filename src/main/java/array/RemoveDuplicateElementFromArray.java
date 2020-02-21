
package array;

/**
 * @author rahul.kumar
 * @version $Id: RemoveDuplicateElementFromArray.java, v 0.1 2020-01-30 23:23 rahul.kumar Exp $$
 */

/**
 * Approach
 * Take two pointers i and j
 * if arr[i] != arr[i+1]  compare i and i+1. If they are not same put it into j and increment j++
 * arr[j] = arr[i]
 * j++
 *
 */
public class RemoveDuplicateElementFromArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,3,4,6,6};
        int n  =removeDuplicateArray(arr);

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

    }


    public static int removeDuplicateArray(int[] arr){



        int j =0;

       for(int i =0; i<arr.length -1; i++){

           if(arr[i] !=arr[i+1]){
               arr[j] =arr[i];
               j++;
           }

       }
        arr[j++] = arr[arr.length-1];


        return j;

    }
}