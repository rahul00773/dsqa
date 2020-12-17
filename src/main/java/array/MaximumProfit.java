package array;

public class MaximumProfit {

    public static void main(String[] args) {


        int[] arr = {7,5,6,3,2,1,9,11};

        System.out.println(getMaximumProfit(arr));
    }

    public static int getMaximumProfit(int[] arr){

        int min = arr[0];

        int profit =0;

        for(int i =1; i<arr.length; i++){

            if(arr[i]<min){
                min=arr[i];
            }

            else
                profit = Math.max(min,arr[i]-min);
            }

        return profit;
        }

    }

