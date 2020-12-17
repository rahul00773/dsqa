import array.sortingAlgorithm.QuickSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairOfArray {


    public static void main(String[] args){


        int[] arr = {5,12,20,-5,0,4,12,20,6,7,3};

        int sum =10;

        printPairWithoutSorting(arr,sum);
    }

    //with sorting
    public static void printPair(int[] arr, int sum){

        QuickSort.doQuickSort(arr,0,arr.length-1);

        int i =0;
        int j = arr.length-1;


        while (i<j){

            if(arr[i] +arr[j]>sum){

                j--;
            }

            else  if(arr[i]+arr[j] <sum){

                i++;
            }

            else {
                  System.out.println("sum pair " + arr[i] + " " + arr[j]);
                  i++;
                  j--;
              }

        }

    }



    //Optimized solution

    public static void printPairWithoutSorting(int[] arr, int sum){

        HashSet<Integer> set  = new HashSet<>();

        for(int i =0; i< arr.length; i++){
            if(!(set.contains(sum-(arr[i])))){
                set.add(arr[i]);
            }
            else{
                System.out.println("pait is " + arr[i] +" " + (sum-arr[i]));
            }

        }


    }
}
