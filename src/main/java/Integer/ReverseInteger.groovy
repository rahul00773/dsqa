package Integer

import org.testng.annotations.Test

class ReverseInteger {


    def reverseInt(int x){

        boolean isNegativeNumber =false;


        if(x<0){
            isNegativeNumber=true;

            x=x*-1;
        }


        long reverse = 0;

        while (x>0){

            reverse = (reverse*10)+(x%10);
            x=x/10;
        }

        if(reverse>Integer.MAX_VALUE)
            return 0;

        return isNegativeNumber?(int)(reverse*-1): (int)reverse

    }

    @Test
    public void testNegativeNumber(){

        println reverseInt(-133);
    }
}
