package Integer;

public class isIntPalindrome {

    public static void main(String[] args){
        System.out.println(isIntPalindrome(-1));
    }

    public static Boolean isIntPalindrome(int x){

        if(x<0){
            return false;
        }

        int divisior =1;

        while (x/divisior >=10)
            divisior*=10;


        while (x!=0){

            int leading = x/divisior;
            int trailing = x%10;


            if(leading!=trailing)
                return false;


           x = (x%divisior)/10;

           divisior=divisior/100;



        }
        return true;
    }
}
