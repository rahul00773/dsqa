
package string;

/**
 * @author rahul.kumar
 * @version $Id: LengthOfLastWord.java, v 0.1 2020-03-21 23:31 rahul.kumar Exp $$
 */
public class LengthOfLastWord {

    public static void main(String[] args) {


        String s = "Hello World";

        lengthOfLastWord(s);

    }

    public static int lengthOfLastWord(String s) {
        int len = s.length();

        String[] s1 = s.split(" ");


        if (s1.length == 0) {
            return 0;
        }
        String s2 = s1[s1.length - 1];

        if (s2.length() == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            j++;
        }

        return j++;


    }
}