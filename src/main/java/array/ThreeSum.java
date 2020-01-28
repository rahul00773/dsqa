
package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author rahul.kumar
 * @version $Id: ThreeSum.java, v 0.1 2020-01-28 23:07 rahul.kumar Exp $$
 */
public class ThreeSum  {

    public static void main(String[] args){

        int[] arr = {-1, 0, 1, 2, -1, -4};

        get3Sum(arr);




    }


    public static HashSet<List<Integer>> get3Sum(int[] nums){


        HashSet<List<Integer>> list1 = new HashSet<>();




        int numsLength = nums.length;

        int i =0; int j =0;

        for ( i =0 ; i <=numsLength-3; i++){

            for ( j =1; j<numsLength-1; j++){
                List<Integer> list = new ArrayList<>();
                if(nums[i] + nums[j] +nums[j+1] ==0){

                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[j+1]);

                        list1.add(list);

                }
            }

        }


        return list1;
    }
}