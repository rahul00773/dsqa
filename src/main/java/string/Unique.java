package string;

import java.util.HashSet;

public class Unique {

    public static boolean areAllCharactersUnique(String str){

       if(str==null){
           return true;
       }
        HashSet<Character> set = new HashSet<>();

        boolean ans=false;

        for (int i =0 ; i<str.length(); i++){

            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                ans=true;
            }

            else{
                return false;
            }

        }
        return ans;
    }

    public static void main(String[] args){

        System.out.println(areAllCharactersUnique("[Empty]"));
    }

}

