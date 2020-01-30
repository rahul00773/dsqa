
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindDuplicate.java, v 0.1 2020-01-31 00:42 rahul.kumar Exp $$
 */
public class FindDuplicate {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,3,2,1};
        int x =9;

        getDuplicateCount(arr,x);
    }

    public static int getDuplicateCount(int[] arr, int x){

        int ans = 0;

        for(int i =0; i<x; i++){

            if (arr[ Math.abs(arr[i])] >= 0)
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }


        return ans;
    }
}