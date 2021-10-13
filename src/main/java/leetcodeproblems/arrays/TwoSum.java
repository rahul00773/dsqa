package leetcodeproblems.arrays;

import java.util.HashSet;

/**
 * Problem Url https://leetcode.com/problems/two-sum/
 * 
 */
public class TwoSum {

public static void main(String[] args){

    int[] arr = new int[]{3,2,4};
    int target = 6;

    int[] output = twoSum(arr, target);

    System.out.println(output[0] + " " + output[1]);

}
    
/**
 * optimal Solution, This will return the values of solution
 * @param num
 * @param target
 * @return
 */
    public static int[]  twoSum(int[] num, int target){
        HashSet<Integer> set = new HashSet<>();
        int[] answer = new int[2];
        for(int i =0; i<num.length; i++){
            if(!set.contains(num[i])){
                set.add(num[i]);
            }
            if(set.contains(target-num[i])){
               answer[0] = target-num[i];
               answer[1] = num[i];
           }
        }

        return answer;
    }


/**
 * Brute Force Solution, This will return the Index of the solution. Which is the actual question
 * @param nums
 * @param target
 * @return
 */
    public int[] twoSumIndex(int[] nums, int target) {
    
        int[] array = new int[2];
         for (int i =0; i<nums.length-1; i++){
             
             for (int j =i+1; j<nums.length; j++){
                 
                 if(nums[i] + nums[j] == target){
                     array[0] = i;
                     array[1] = j ;
                    
                     
                 }
             }
         }
         
         return array;
     }
}
