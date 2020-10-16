package dailycodingproblem;

import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
     */


     public static void main(String[] args){

        System.out.println(getCountMaxSubArray("aba"));
     }


     public static int getCountMaxSubArray(String s){

        if(s==null || s.equals("")){
            return 0;
        }


        Set<Character> set = new HashSet<>();


        int i =0; 
        int max =0;
        int globalMax=0;


        for(i=0; i<s.length(); i++){


            if(!set.contains(s.charAt(i))){

                set.add(s.charAt(i));
                max++;
            }

            else{
                
            }
           if(globalMax<max){

            globalMax=max;
            max=0;
          }
        }

return globalMax;

     }
}
