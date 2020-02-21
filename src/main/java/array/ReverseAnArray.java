
package array;

/**
 * @author rahul.kumar
 * @version $Id: ReverseAnArray.java, v 0.1 2020-02-22 00:01 rahul.kumar Exp $$
 */
public class ReverseAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        reverseArray(arr);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void reverseArray(int[] arr){

        int n = arr.length-1;

        int i = 0;
        while (i<n){

            int temp = arr[i];
            arr[i] = arr[n];

            arr[n]= temp;
            i++;
            n--;
        }

    }
}