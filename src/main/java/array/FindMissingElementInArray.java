
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMissingElementInArray.java, v 0.1 2020-01-26 23:55 rahul.kumar Exp $$
 */
public class FindMissingElementInArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,7,8,9,10};

        System.out.println("Missing element in array is  " + getMissingArray(arr));


    }

    public static int getMissingArray(int[] arr){

        int n = arr.length;
        int total = (n+1) * (n+2) /2;
        int sumOfArray = 0;
        for(int i = 0 ; i<n; i++){
            sumOfArray += arr[i];

        }

        return total-sumOfArray;
    }

}