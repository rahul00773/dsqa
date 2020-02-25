
package string;

/**
 * @author rahul.kumar
 * @version $Id: ReverseInteger.java, v 0.1 2020-02-26 00:13 rahul.kumar Exp $$
 */
public class ReverseInteger {


    public static void main(String[] args){



        System.out.println( reverseInt(-123));

    }

    public static int reverseInt(int x){

        int ans = 0;

        while (x!=0){

            ans = ans*10+x%10;
            x = x/10;
        }

        if(ans<Integer.MIN_VALUE || ans >Integer.MAX_VALUE){
            return 0;

        }

        return (int) ans;
    }
}