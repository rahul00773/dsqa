
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMaxElement.java, v 0.1 2020-01-27 00:38 rahul.kumar Exp $$
 */
public class FindMaxElement {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,2,2,5,7,8,9,10,12};

        System.out.println(getMaxElement(arr));


    }

    public static int getMaxElement(int[] arr){

        int arrayLength = arr.length;

        if(arrayLength ==0){
            return  0;
        }

        int max= arr[0];

        for (int i =1; i<arrayLength; i++){

            if(max<arr[i]){

                max = arr[i];
            }
        }

        return max;
    }
}