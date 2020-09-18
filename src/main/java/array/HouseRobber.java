package array;

public class HouseRobber {


    /**
     * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
     * 
     */

    public static void main(String[] args){

        int[] arr = {1,2,3,5,8};
        System.out.println(" maximum profit is: "+ getMaxMoney(arr));

    }

/**
 * Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
 * @param arr
 * @return
 */
    public static int getMaxMoney(int[] arr){

        // Base Condition if arr size is 0

        if(arr.length ==0) return 0;
        
        // If size of array is 1

        if(arr.length==1) return arr[0];


        // check if arr size is two then we have to return maximun from it


        int[] dp  = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2; i<arr.length; i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }

        return dp[arr.length-1];

    }
    
}
