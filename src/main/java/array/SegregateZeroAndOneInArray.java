
package array;

/**
 * @author rahul.kumar
 * @version $Id: SegregateZeroAndOneInArray.java, v 0.1 2020-02-02 23:08 rahul.kumar Exp $$
 */
public class SegregateZeroAndOneInArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 0, 0};
        int[] newArr = segregateZeroAndOne(arr);
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


}