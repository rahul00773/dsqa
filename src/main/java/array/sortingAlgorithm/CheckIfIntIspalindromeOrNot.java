
package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: CheckIfIntIspalindromeOrNot.java, v 0.1 2020-03-05 00:35 rahul.kumar Exp $$
 */
public class CheckIfIntIspalindromeOrNot {

    public static boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int input = x;
        int rev =0;

        while(x!=0){

            rev = rev*10+x%10;

            x=x/10;
        }


       return input ==rev;

    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));

    }
}