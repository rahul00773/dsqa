
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindSecondLargestElement.java, v 0.1 2020-01-26 23:26 rahul.kumar Exp $$
 */
public class FindSecondLargestElement {

    public static void main(String[] args){

        int[] arr = {1,2,5,7,8,9,10,12,14,15,20};

        System.out.println("second largest element is " + getSecondLargest(arr,arr.length));
    }


    public  static int getSecondLargest(int[] arr, int lengthOfArray){


        if(lengthOfArray <= 1){
            return 0;
        }
        int firstLargestElement, secondLargestElement=0;


        firstLargestElement = arr[0];

        //secondLargestElement = arr[1];

        for (int i =1; i<lengthOfArray; i++){

            if(arr[i]>firstLargestElement){

                secondLargestElement = firstLargestElement;
                firstLargestElement = arr[i];

            }


        }

        return secondLargestElement;
    }
}