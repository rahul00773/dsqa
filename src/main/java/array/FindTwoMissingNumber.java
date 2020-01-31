
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindTwoMissingNumber.java, v 0.1 2020-01-31 23:47 rahul.kumar Exp $$
 */
public class FindTwoMissingNumber {

    public static void main(String[] args){

        int[] arr = {1,3,5,6};
        int n =6;

        printTwoMissingNumber(arr,n);

    }


    public static void printTwoMissingNumber(int[] arr, int n){


        boolean[] mark = new boolean[n+1];

        for(int i =0; i<n-2; i++){
            mark[arr[i]] = true;
        }


        System.out.println("Two Missing numbers are");

        for(int i =1; i<=n; i++){
            if(!mark[i]){
                System.out.print(i + " ");
            }
        }


    }
}