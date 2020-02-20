
package array;

import java.util.Scanner;

/**
 * @author rahul.kumar
 * @version $Id: XorOperation.java, v 0.1 2020-02-21 01:35 rahul.kumar Exp $$
 */
public class XorOperation {

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

    public static String stringsXOR(String s, String t) {

        Integer a = Integer.valueOf(s);

        Integer b = Integer.valueOf(t);

        String s1 = String.valueOf(a^b);
        return s1;



    }

}