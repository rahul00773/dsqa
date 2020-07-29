package Integer;

public class CoupleSum {

    public static void main(String[] args) {

        int[] arr = {1, 9, 3, 4, 5};
        int[] ad =coupleSum(arr, 10);
        System.out.println(ad[0] + ""+ad[1]);
    }

    public static int[] coupleSum(int[] numbers, int target) {



        int[] ans = new int[2];
        for (int i =0; i<numbers.length; i++){

            for (int j =i+1; j<numbers.length-1; j++){
                if(numbers[i]+numbers[j]==target){

                    ans[0]=i+1;

                    ans[1]=j+1;
            }


            }
        }





        return ans;
    }
}