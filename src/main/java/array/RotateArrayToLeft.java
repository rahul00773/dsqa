
package array;

/**
 * @author rahul.kumar
 * @version $Id: RotateArrayToLeft.java, v 0.1 2020-02-05 00:47 rahul.kumar Exp $$
 */
public class RotateArrayToLeft {

    public static void main(String[] args){
        int[] arr = {1, 2, 3 ,4, 5 };

        int x = 2;
        rotateArr(arr,x);

        for (int i = 0 ; i<arr.length; i++){

            System.out.println(arr[i]);
        }
    }

    public static void rotateArr(int[] arr, int x){

        int lastIndex = arr.length;

        int firstPart = lastIndex-x;
        int i =0;

        // rotate first Part of array

        while (i<firstPart){

            int temp = arr[i];
            arr[i] = arr[firstPart];
            arr[firstPart] =temp;

            i++;
            firstPart--;
        }

        while (firstPart<lastIndex){

            int temp = arr[lastIndex-1];
            arr[lastIndex-1] = arr[firstPart];
            arr[firstPart] =temp;

            firstPart++;
            lastIndex--;

        }

        while (i<lastIndex-1){
            int temp = arr[i];
            arr[i] = arr[lastIndex-1];
            arr[lastIndex-1] =temp;

            i++;
            lastIndex--;

        }

    }






}