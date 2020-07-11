package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {

    public static void main(String[] args){
        int[] arr ={1,2,3,1,2};
        System.out.println(duplicate(arr));

    }

    public static String duplicate(int[] numbers){

        if(numbers.length==0){
            return null;
        }

        int k=0;
        List<Integer> str =new ArrayList<>();
        for(int i=0; i<numbers.length; i++){

            for(int j=i+1;j<numbers.length; j++){

                if(numbers[i]==numbers[j]){
                    str.add(numbers[i]);

                }
            }
        }

       str.sort(Integer::compareTo);
        return str.toString();


    }
}
