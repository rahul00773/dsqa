package array;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class SubSetOfArray {

     static int ans;
    public static void main(String[] args){

    int[] arr = {1,9,8,3,-1,0};
        List<List<Integer>> lists= subsets(arr);

        for(List<Integer> i: lists){

            for (int j =0; j<i.size(); j++ ){
                System.out.println(i.get(j));
            }
        }


    }

    public static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < Math.pow(2,n); i++)
        {
           List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <Math.pow(2,n); j++){

                if((i & (1<<j)) > 0 ){
                    list1.add(nums[j]);
                    System.out.print("("+i+" "+j+")"+" ");
                    System.out.print(nums[j]+" ");
                }

            }
            list.add(list1);

            System.out.println();
        }


        return list;

    }
}
