
package array;

/**
 * @author rahul.kumar
 * @version $Id: MaxSumFromSubArray.java, v 0.1 2020-02-04 01:03 rahul.kumar Exp $$
 */
public class MaxSumFromSubArray {

    public static void main(String[] args){

        int arr[] = {-2,1,0,1,2,3,2,-1,3,1,2,3,-1,-2};
        int arr1[] = {-2,3,2,-1};


        System.out.println("Maximum sub array from array:  " + getMaxFromSubArray(arr1));
    }


    public static int getMaxFromSubArray(int[] arr){

        int max_element=arr[0];
        int global_max = arr[0];


        for(int i =1; i<arr.length; i++){

            if(arr[i]>max_element+arr[i]){
                max_element=arr[i];
            }

            else {
                max_element= max_element+arr[i];
            }

            if(max_element>global_max)
                global_max= max_element;
        }

    return global_max;
    }
}