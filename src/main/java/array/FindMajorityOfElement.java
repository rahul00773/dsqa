
package array;

/**
 * @author rahul.kumar
 * @version $Id: FindMajorityOfElement.java, v 0.1 2020-02-06 01:04 rahul.kumar Exp $$
 */
public class FindMajorityOfElement {

    public static void main(String[] args){

        int[] arr ={2,2};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] arr){
        int m = -1;

        int i =0;

        for(int j =0; j<arr.length; j++){

            if(i == 0){
                m = arr[j];
                i=1;
            }

            else if(m == arr[j]){

                i++;
            }

            else {
                i--;
            }
        }

        int x =0;
        for(int k =0; k<arr.length; k++){
            if(arr[k] ==m){
                x++;
            }
        }
        if(x>arr.length/2){
            return m;
        }

        return -1;
    }
}