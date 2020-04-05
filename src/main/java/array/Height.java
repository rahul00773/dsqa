
package array;

import java.util.Scanner;

/**
 * @author rahul.kumar
 * @version $Id: Height.java, v 0.1 2020-04-05 14:34 rahul.kumar Exp $$
 */
public class Height {

    public static void main(String[] args){

        int[] arr  = {88 ,57, 44, 92, 28, 66, 60, 37, 33, 52, 38 ,29,76, 8, 75,
                22};

        System.out.println(getBuildingCount(arr));
    }


    public static int getBuildingCount(int[] arr){


  /*      Scanner sc  = new Scanner(System.in);

        int x = sc.nextInt();

        int arrLength = sc.nextInt();
        int[] arr1 = new int[arrLength];

        for (int i =0; i<arrLength; i++){
            arr1[i]= arrLength;
        }*/
        int count = 0;
        int max =arr[0];
        for(int i =0; i<arr.length; i++){

           if(arr[i]>max){
               count++;
               max = arr[i];
           }



        }

        return count;
    }
}