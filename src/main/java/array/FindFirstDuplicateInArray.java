
package array;

import java.util.HashSet;

/**
 * @author rahul.kumar
 * @version $Id: FindFirstDuplicateInArray.java, v 0.1 2020-02-25 23:14 rahul.kumar Exp $$
 */
public class FindFirstDuplicateInArray {


    public static void main(String[] args){

        int[] arr = {1,2,3,4,2,1,4,2};


        printFirstDuplicate(arr);
        printFirstDuplicateUsingHashSet(arr);



    }

    public static void printFirstDuplicate(int[] arr){


        for(int i =0; i<arr.length-1; i++){

            for (int j = i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){

                    System.out.println("first duplicate element is:  " + arr[i]);

                }

            }

            break;
        }

    }


    public static void printFirstDuplicateUsingHashSet(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>();

        int min = -1;

        for(int i = arr.length-1; i>=0; i--){

            if(hashSet.contains(arr[i])){
                min = arr[i];
            }

            else
                hashSet.add(arr[i]);
        }

        if(min !=-1)
             System.out.println("first duplicate element is : " + min);
    }

}