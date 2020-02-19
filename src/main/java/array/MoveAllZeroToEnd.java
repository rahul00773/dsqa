
package array;

/**
 * @author rahul.kumar
 * @version $Id: MoveAllZeroToEnd.java, v 0.1 2020-01-31 01:07 rahul.kumar Exp $$
 */

/**
 * Approach to move all Zero to end
 * We have taken one variables - count - And we will track till when zero is not present
 * If element is not equal to zero then we will replace the element with count and increment count
 * if element is zero we will do nothing
 */
public class MoveAllZeroToEnd {

    public static void main(String[] args){
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
       int x[] =  moveAllZeroToEnd(arr);

       for(int i =0 ; i<x.length; i++){

           System.out.println(x[i]);
       }

    }

    public static int[] moveAllZeroToEnd(int[] arr){

        int count = 0;
        int temp;
        for( int i=0; i<arr.length; i++){

            if(arr[i] !=0){

                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;

    }
}