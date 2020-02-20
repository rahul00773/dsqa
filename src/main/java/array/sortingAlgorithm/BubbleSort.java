package array.sortingAlgorithm;

/**
 * @author rahul.kumar
 * @version $Id: BubbleSort.java, v 0.1 2020-02-11 01:18 rahul.kumar Exp $$
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 2, 1, 5};
        doBubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void doBubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}