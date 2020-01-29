
package array;

/**
 * @author rahul.kumar
 * @version $Id: SearchInUnsortedArray.java, v 0.1 2020-01-29 23:53 rahul.kumar Exp $$
 */
public class SearchInUnsortedArray {

    public static void main(String[] args){

        int[] arr  = {1,2,3,5,8,10,12,15,17,18,20};

        System.out.println("Element present in array  " + isElementExist(arr,10));
    }


    public static boolean isElementExist(int[] arr ,int n){

        for(int i =0; i<arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
}