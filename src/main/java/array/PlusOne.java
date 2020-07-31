package array;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        digits[n-1]=digits[n-1]+1;
        int carry = digits[n-1]/10;

        int y = digits[n-1]%10;
        digits[n-1]=y;

        for(int i=n-2; i>=0; i--){
            if(carry==1){
                digits[i] = digits[i]+1;
                //digits[i]=x;
                carry = digits[i] / 10;
                digits[i] = digits[i]%10;
                //digits[i]=k;

            }
        }

        if(carry==1) {
            int[] newA = new int[digits.length + 1];

            newA[0] = 1;
            int j = 1;
            for (int k = 0; k < digits.length; k++) {
                newA[j] = digits[k];
                j++;
            }

            return newA;
        }

      return digits;
    }

    public static void main(String[] args){
        int[] arr = {8,9,9};

       int[] arr2= plusOne(arr);

       for(int i=0; i<arr2.length; i++){
           System.out.println(arr2[i]);
       }
    }
}
