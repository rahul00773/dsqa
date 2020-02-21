
package array;

import java.util.HashSet;

/**
 * @author rahul.kumar
 * @version $Id: LongestSubSequence.java, v 0.1 2020-01-28 01:54 rahul.kumar Exp $$
 */
public class LongestSubSequence {

    public static void main(String[] args){

        int[] arr = {2,9,1,3,4,10,20};

        System.out.println(getLongestConsequetiveSequence(arr));

    }

    public static int getLongestConsequetiveSequence(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i =0; i<arr.length; i++){

            hashSet.add(arr[i]);

        }

        int count = 0;

        for (int i =0; i<arr.length; i++){

            if(!hashSet.contains(arr[i]-1)){

                int no = arr[i];
                while (hashSet.contains(no)){
                    no++;

                }


                if(count<no-arr[i]){
                    count = no-arr[i];
                }
            }
        }
return count;



    }


}