
package array;

/**
 * @author rahul.kumar
 * @version $Id: CheckForPalindrome.java, v 0.1 2020-02-22 14:43 rahul.kumar Exp $$
 */
public class CheckForPalindrome {


    public static void main(String[] args){

        String s = "aba";

        System.out.println(checkForPalindomr(s));

    }

    public static boolean checkForPalindomr(String s){

        boolean ans = true;

        int i =0;
        int j = s.length()-1;

        while (i<j){

            if(s.charAt(i) != s.charAt(j)){
                ans = false;
            }

            i++;
            j--;
        }

        return ans;

    }
}