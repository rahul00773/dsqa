package Integer;

public class MultiplyTwoNumbersWithoutUsingStar {


    public static void main(String[] args){

        System.out.println(multiplytwoNum(10,20));

    }


    public  static int multiplytwoNum(int x, int y){


        int ans =0;


        for(int i=0; i<x; i++){

            ans+=y;
        }


        return ans;

    }
}
