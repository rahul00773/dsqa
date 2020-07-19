
package array;

/**
 * @author rahul.kumar
 * @version $Id: SegregateZeroAndOneInArray.java, v 0.1 2020-02-02 23:08 rahul.kumar Exp $$
 */
public class SegregateZeroAndOneInArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 0, 0};
        int[] newArr = test(arr);
        for (int i = 0; i < newArr.length; i++)
            System.out.println(newArr[i]);


    }

    public static int[] segregateZeroAndOne(int[] arr) {
        int count = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                count++;

        int j;
        for (j = 0; j < count; j++)
            newArr[j] = 0;

        while (j < arr.length)
            newArr[j++] = 1;

        return newArr;
    }


    public static int[] segregateZeroAndOneUsingCounter(int[] arr){

        int left =0; int right = arr.length-1;

        while (left<right){

            while (arr[left] ==0 && left<right){
                left++;
            }

            while (arr[right] ==1 &&left<right)
                right--;

            if(left<right)
            {

                arr[left]=0;
                arr[right] =1;
                left++;
                right--;
            }
        }

        return arr;
    }


    public static int[] test(int[] arr){

        int i=0;

        int j= arr.length-1;


        while (i<j){


            if(arr[i]>arr[j]){


               int temp= arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
            }

            i++;
            j--;
        }
        return  arr;
    }

}