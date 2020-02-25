
package string;

/**
 * @author rahul.kumar
 * @version $Id: ReverseStringLeetCode.java, v 0.1 2020-02-25 23:57 rahul.kumar Exp $$
 */
public class ReverseStringLeetCode {

    public static void main(String[] args){

        char[] s = {'a','b','c','d','e'};
        reverseString(s);

        for(int i =0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }

    }

    public static void reverseString(char[] s) {

        int i =0;
        int j = s.length-1;
        while(i<j){

            char temp =  s[i];
            s[i] = s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}