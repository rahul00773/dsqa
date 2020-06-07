
package array;

/**
 * @author rahul.kumar
 * @version $Id: ValidMountainArray.java, v 0.1 2020-06-07 16:37 rahul.kumar Exp $$
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] A) {

        boolean ans = true;

        int i=0;
        int j= A.length-1;

        while(i<j){

            if(A[i]<A[i+1] && A[j]<A[j-1]){
                ans= false;

            }
            i++;
            j--;
        }

        return ans;
    }


    public static void main(String[] args){

        ValidMountainArray validMountainArray=  new ValidMountainArray();

        int[] arr = {2,1};

        System.out.println(validMountainArray.validMountainArray(arr));
    }
}