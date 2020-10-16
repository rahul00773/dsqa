import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static void main(String[] args){


        int[] x = {4,3,2,7,8,2,3,1};

        for(int y: x ){

            System.out.println(x[y]);
        }

       List<Integer> output=  getDuplicate(x);

       for(Integer o:output)
       {
           System.out.print(o);
       }
    }
    
    public static List<Integer> getDuplicate(int[] nums){

        List<Integer> arrList = new ArrayList<>();


        for(int i=0; i<nums.length; i++){


            if (nums[ Math.abs(nums[i])] >= 0)
                nums[ Math.abs(nums[i])-1] = -nums[ Math.abs(nums[i])-1];
            else
                arrList.add(Math.abs(nums[i])-1);

        }


        return arrList;
    }
}