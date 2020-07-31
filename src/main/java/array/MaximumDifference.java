package array;

public class MaximumDifference {

    public static void main(String[] args){

        int arr[] = {1, 2, 90, 10, 110};
        System.out.println(maxDifference(arr));

    }


    public static int maxDifference(int[] arr){

        int maxDiff =-1;

        int n = arr.length-1;
        int maxRight = arr[n];


        for(int i =n-1; i>=0; i--){

            if(arr[i]>maxRight){

                maxRight=arr[i];
            }

            else {

                int diff = maxRight -arr[i];

                if(diff>maxDiff){
                    maxDiff=diff;
                }

            }
        }


        return maxDiff;

    }
}
