
package array.algorithms;

/**
 * @author rahul.kumar
 * @version $Id: KadanesAlgorithm.java, v 0.1 2020-02-20 00:00 rahul.kumar Exp $$
 */


import java.util.Scanner;

/**
 * Problem Statement
 * Find Maximum Sub Array from array by using Kadanes algorithm
 */
public class KadanesAlgorithm {


    public static void main(String[] args){

        int[] arr  = {2,3,-1,4,5,6};

        System.out.println(maxSumUsingKadanesAlgorithm(arr));

        Scanner sc = new Scanner(System.in);



    }

    public static int maxSumUsingKadanesAlgorithm(int[] arr){

        int maxSum = arr[0];
        int globalMaxSum = arr[0];

        for (int i =1; i<arr.length; i++){


            if(arr[i]>maxSum+arr[i]){

                maxSum=arr[i];
            }

            else {
                maxSum=arr[i]+maxSum;
            }

            if(maxSum>globalMaxSum)
                globalMaxSum= maxSum;

        }

        return globalMaxSum;

    }
}