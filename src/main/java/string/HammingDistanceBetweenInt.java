
package string;

/**
 * @author rahul.kumar
 * @version $Id: HammingDistanceBetweenInt.java, v 0.1 2020-03-26 23:56 rahul.kumar Exp $$
 */
public class HammingDistanceBetweenInt {


    public static void main(String[] args){

        System.out.println(getHammingDistance(1,4));
    }

    public static int  getHammingDistance(int x1, int x2){

        int x = x1^x2;

        int s =0;
                while (x>0){

                    s += x & 1;
                    x>>=1;
                }

                return s;
    }
}