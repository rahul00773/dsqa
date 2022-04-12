package study;

public class InsertProblem {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println("" + searchInsert(arr,2));
    }
    


    public  static int searchInsert(int[] nums, int target) {
        int output =0;
        
        for (int i= 0; i<nums.length; i++){
            if (nums[i] == target){
                return i;
              }
              
               if(nums[i]>target){
                  return i;
              }
          }
          return nums.length+1;
    }
}
