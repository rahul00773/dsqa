
package array;

import java.util.HashSet;

/**
 * @author rahul.kumar
 * @version $Id: LongestSubStringWithoutRepeatigCharacters.java, v 0.1 2020-01-28 01:42 rahul.kumar Exp $$
 */
public class LongestSubStringWithoutRepeatigCharacters {

    public static void main(String[] args){

        System.out.println(getLongestSubString("abcabcaba"));
        System.out.println(getLongestSubString("bbbbb"));

    }


    public static int getLongestSubString(String s){

        int i =0;
        int j =0;
        int max =0;

        HashSet<Character> hashSet = new HashSet<>();

        while (j<s.length()){

            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(),max);
            }

            else {

                hashSet.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }

}