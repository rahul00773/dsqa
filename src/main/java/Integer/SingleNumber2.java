package Integer;

import java.util.HashSet;

public class SingleNumber2 {


    public static int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();


        for (int i =0; i<nums.length; i++){


            if(set.contains(nums[i])){

                set.remove(nums[i]);
            }

            else{

                set.add(nums[i]);
            }
        }


        int[] arr = new int[set.size()];
        int j=0;


        for (Integer set1:set){


            arr[j++]=set1;
        }


        return arr[0];

    }


    public static void main(String[] args){


        int[] arr= {2,2,3,4,4};
        System.out.println(singleNumber(arr));

    }
}
