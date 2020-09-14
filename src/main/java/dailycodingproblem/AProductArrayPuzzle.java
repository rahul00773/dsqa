package dailycodingproblem;

import java.net.Socket;

public class AProductArrayPuzzle {

    /**
     * This problem was asked by Uber. 
     * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]
     */
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};

        int[] product = getProduct(arr);

        for(int i=0; i<product.length; i++){

            System.out.println(product[i]);
        }

    }


    public static int[] getProduct(int[] arr){

        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        int[] product = new int[n];


        prefix[0] = 1;

        suffix[n-1]=1;


        for(int i =1; i<n; i++){
            prefix[i] = arr[i-1]*prefix[i-1];
        }


        for(int j=n-2;j>=0; j--){
            suffix[j]=arr[j+1]*suffix[j+1];
        }

        for(int i =0; i<n; i++){
            product[i]=prefix[i]*suffix[i];
        }

        return product;

    }


    
}