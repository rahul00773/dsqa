
package array;

/**
 * @author rahul.kumar
 * @version $Id: CountPairWithGivenSum.java, v 0.1 2020-01-30 01:04 rahul.kumar Exp $$
 */
public class CountPairWithGivenSum {

    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4,5,6};
        int sum = 6;

        System.out.println(countPair(arr,sum));

    }

    public static int countPair(int[] arr, int sum){

        int ans = 0;

        int i =0;

        int j = arr.length-1;

       while (i<j){

           if(arr[i] + arr[j] <sum){
               i++;

           }

           else if(arr[i] + arr[j] >sum){
               j--;
           }

           else {

               int x = arr[i], xx = i;
               while ((i < j ) && (arr[i] == x))
                   i++;

               int y = arr[j], yy = j;

               while ((j >= i ) && (arr[j] == y))
                   j--;

               if (x == y)
               {
                   int temp = i - xx + yy - j - 1;
                   ans += (temp * (temp + 1)) / 2;
               }
               else
                   ans += (i - xx) * (yy - j);
           }
       }

       return ans;

    }
}