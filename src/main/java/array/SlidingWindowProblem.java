
package array;

/**
 * @author rahul.kumar
 * @version $Id: SlidingWindowProblem.java, v 0.1 2020-01-27 00:18 rahul.kumar Exp $$
 */
public class SlidingWindowProblem {

    public static void main(String[] args){

        int[] arr  = {1,2,3,4,5,6,7,8,9,10,11,12,15};

        int k = 3;

        int[] arr1 = getMaxFromSlidingWindow(arr,k);

        for (int i =0; i<arr1.length; i++){

            System.out.print(arr1[i] + " ");
        }
    }


    public static int[] getMaxFromSlidingWindow(int[] arr, int k ){


        int n = arr.length;
        int x = 0;
        int[] responseArray = new int[n-2];
        int max;

        for(int i =0 ; i<= n-k; i++){

            max = arr[i];

            for (int j =1; j<k; j++)
            {
                if(arr[i+j]> max){

                    max = arr[i+j];
                }
            }

            responseArray[x]= max;
            x++;
        }

        return responseArray;

    }
}