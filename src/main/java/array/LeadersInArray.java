
package array;

/**
 * @author rahul.kumar
 * @version $Id: LeadersInArray.java, v 0.1 2020-02-05 23:36 rahul.kumar Exp $$
 */
public class LeadersInArray {

    public static void main(String[] args){
        int[] arr = {16,17,3,4,5,2};

        getLeadersUsingTwoLoop(arr);

        getLeadersUsingOneLoop(arr);

    }

    public static void getLeadersUsingTwoLoop(int[] arr){

        for(int i =0; i<arr.length; i++){

            int j;
            for( j=i+1; j<arr.length; j++){

                if(arr[i] <= arr[j]){
                    break;
                }

            }

            if(j==arr.length){
                System.out.print(arr[i] + " ");
            }
        }
    }


    public static void getLeadersUsingOneLoop(int[] arr){

        System.out.print(arr[arr.length-1] + " ");
        for(int i = arr.length-2; i>=0; i--){

            if(arr[i]>arr[i+1]){
                System.out.print(arr[i] +" ");
            }
        }
    }
}