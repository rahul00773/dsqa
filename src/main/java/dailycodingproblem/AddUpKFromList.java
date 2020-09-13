package dailycodingproblem;


public class AddUpKFromList {

    /**
     * This problem was recently asked by Google. Given a list of numbers and a
     * number k, return whether any two numbers from the list add up to k. For
     * example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */

    public static void main(String[] args) {

        int[] arr={10,15,3,7};

        boolean result = isAddUpToK(arr, 3);

        System.out.println("num Sum can be formed from list is:  " +  result);

    }

    public static boolean isAddUpToK(int[] arr, int num) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] + arr[j] == num) {

                return true;

            }

            if (arr[i] > arr[j]) {
                i++;
            }

            else {
                j--;
            }
        }

        return false;

    }

}