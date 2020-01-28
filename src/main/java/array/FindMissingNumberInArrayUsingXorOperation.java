
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMissingNumberInArrayUsingXorOperation.java, v 0.1 2020-01-28 23:51 rahul.kumar Exp $$
 */
public class FindMissingNumberInArrayUsingXorOperation {


    public static void main(String[] args){


        int[] arr = {1,2,3,4,6,7,8,9,10};

        System.out.println(getMissingNumber(arr,9));

    }


    public static int getMissingNumber(int[] arr,int n){

        int n1 = arr.length;

        int x1 = arr[0];
        int x2 = 1;

        for (int i =1; i<=n1-1; i++){

            x1 = x1 ^ arr[i];

        }

        for(int i = 2; i<=n1+1; i++){
            x2 = x2 ^ i;
        }

        return (x1^x2);

    }
}