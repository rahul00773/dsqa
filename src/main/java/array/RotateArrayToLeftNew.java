
package array;

/**
 * @author rahul.kumar
 * @version $Id: RotateArrayToLeftNew.java, v 0.1 2020-03-01 00:50 rahul.kumar Exp $$
 */
public class RotateArrayToLeftNew {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int k =4;

        rorateArray(arr,k);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void rorateArray(int[] arr, int k){

        int i =0;
        int j = arr.length-k;
        int x = arr.length-1;

        while (i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]  =temp;
            i++;
            j--;
        }

        while (j<x){

             int temp = arr[j];
             arr[j] = arr[x];
             arr[x] = temp;
             x--;
             j++;
        }

        while (i<x){

            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
            x--;
            i++;
        }
    }
}
