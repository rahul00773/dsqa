
package array;

/**
 * @author rahul.kumar
 * @version $Id: NumberOfZero.java, v 0.1 2020-03-05 05:45 rahul.kumar Exp $$
 */
public class NumberOfZero {

    static int  count;
    public static void main(String[] args){


        System.out.println(numbersOfZero(12345));
    }

    public static int numbersOfZero(int x){



        int ans = 0;

        int i = 0; int j =1;
        while (x!=0){

            ans = ans*10+x%10;
            x = x/10;
            numbersOfZero(x);
        }

        return count;

    }
}