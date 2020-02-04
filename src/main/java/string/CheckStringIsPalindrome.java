
package string;

/**
 * @author rahul.kumar
 * @version $Id: CheckStringIsPalindrome.java, v 0.1 2020-02-05 00:03 rahul.kumar Exp $$
 */
public class CheckStringIsPalindrome {

    public static void main(String[] args){

        System.out.println(isStringPalindrome("hello olleh"));
    }

    public static boolean isStringPalindrome(String string){

        int i =0; int j= string.length()-1;

        while (i<j){
            if(string.charAt(i)!=string.charAt(j))
                return false;

            j--;
            i++;
        }

        return true;
    }
}