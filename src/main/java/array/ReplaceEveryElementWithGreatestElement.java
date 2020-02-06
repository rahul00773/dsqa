
package array;

/**
 * @author rahul.kumar
 * @version $Id: ReplaceEveryElementWithGreatestElement.java, v 0.1 2020-02-07 00:23 rahul.kumar Exp $$
 */
public class ReplaceEveryElementWithGreatestElement {

    public static void main(String[] args){

    int[] arr = {16, 17, 4, 3, 5, 2};

    replaceElement(arr);

    for(int i = 0; i<arr.length; i++){

        System.out.println(arr[i]);
    }

    }


    public static void replaceElement(int[] arr){

        int arrLength = arr.length;

        if(arrLength==1){

            arr[0] = -1;
        }

        int max_from_right =  arr[arrLength-1];

       arr[arrLength-1] = -1;



        for(int i = arrLength-2; i>=0; i--){
            int temp = arr[i];

            arr[i] = max_from_right;

            if(max_from_right<temp){

                max_from_right=temp;
            }

        }

    }
}