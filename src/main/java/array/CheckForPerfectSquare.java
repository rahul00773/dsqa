
package array;

/**
 * @author rahul.kumar
 * @version $Id: CheckForPerfectSquare.java, v 0.1 2020-02-08 23:43 rahul.kumar Exp $$
 */
public class CheckForPerfectSquare {


    public static void main(String[] args){

        System.out.println("is given number a perfect square ?: " + checkPerfectSquareOrNot(49));


    }


    public static boolean checkPerfectSquareOrNot(int n){


        Math.sqrt(2);

        for (int i =1 ; i*i <=n ; i++){

            if((n%i ==0) && (n/i ==i)){
                return true;
            }
        }

        return false;
    }
}