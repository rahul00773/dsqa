
package string;

import java.util.HashSet;

/**
 * @author rahul.kumar
 * @version $Id: FirstUniqChar.java, v 0.1 2020-02-26 00:27 rahul.kumar Exp $$
 */
public class FirstUniqChar {

    public static void main(String[] args){
        System.out.println(getFirstUniq("loveleetcode"));

    }

    public static int getFirstUniq(String s){

        int ans = -1;
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = s.length()-1; i>=0; i--){

            if(!hashSet.contains(s.charAt(i))){
               ans =i;
                hashSet.add(s.charAt(i));
            }

            else {


                hashSet.add(s.charAt(i));
            }



        }

        return ans;

    }
}