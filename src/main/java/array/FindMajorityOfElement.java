
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMajorityOfElement.java, v 0.1 2020-02-06 01:04 rahul.kumar Exp $$
 */


/**
 * Majority of Element defination -  if element presence in array is greater than n/2. Where n is length of array
 * This problem can be achieved  by Boyer Mayor Majority algorithm
 */
public class FindMajorityOfElement {

    public static void main(String[] args){

        int[] arr ={2,2,2,0,4,3,2,3,1,2,2,2,4,1,2};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] arr){
        int m = -1;
        int i =0;
        for(int j =0; j<arr.length; j++){
            if(i == 0){
                m = arr[j];
                i=1;
            }
            else if(m == arr[j]){

                i++;
            }
            else {
                i--;
            }
        }

        int x =0;
        for(int k =0; k<arr.length; k++){
            if(arr[k] ==m){
                x++;
            }
        }
        if(x>arr.length/2){
            return m;
        }

        return -1;
    }
}