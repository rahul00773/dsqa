
package Integer;

/**
 * @author rahul.kumar
 * @version $Id: CompareTwoInt.java, v 0.1 2020-04-04 15:12 rahul.kumar Exp $$
 */

/**
 * Problem statement- Compare two integers if they are equal or not without using any compare object
 */
public class CompareTwoInt {

    public static void main(String[] args){

        System.out.println(compareInt(2,2));
        System.out.println(compareIntSecondApproach(2,2));
    }

    public static boolean compareInt(int x , int y){
        int ans;
        ans =  x^y;

        if(ans>0){
            return false;
        }

        return true;
    }


    public static boolean compareIntSecondApproach(int x ,int y){

        if(x-y==0){
            return true;
        }

        return false;
    }
}