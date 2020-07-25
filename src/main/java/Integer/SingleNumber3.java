package Integer;

public class SingleNumber3 {


    public static void main(String[] args){

        int[] arr= {2,2,3,4,4};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){

        int res = arr[0];

        for (int i =1;i<arr.length; i++){

            res = res ^ arr[i];
        }

        return  res;

    }
}
