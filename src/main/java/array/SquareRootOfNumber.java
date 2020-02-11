
package array;

/**
 * @author rahul.kumar
 * @version $Id: SquareRootOfNumber.java, v 0.1 2020-02-12 00:38 rahul.kumar Exp $$
 */
public class SquareRootOfNumber {

    public static void main(String[] args){

        System.out.println(findSquareRoot(10));

    }

    public static double findSquareRoot(double num){

        double d = 0;

        double i =1;

        boolean found = false;

        while (!found){

            if(i*i==num){
                found = true;
              d =i;

            }

            else if(i*i >num){

                double res = Square(num, i - 1, i);
               // System.out.printf("%.5f", res);
                d=res;
                found = true;

            }
            i++;
        }

        return d;

    }


    public static double Square(double num,double i, double j){

        double mid = (i + j) / 2;
        double mul = mid * mid;

        if((mul == num) || Math.abs(mul-num)<0.00001){
            return mid;
        }

        else if(mul<num){
            return Square(num,mid,j);
        }
        else {
            return Square(num,i,mid);
        }

    }
}