package string;

import java.util.HashMap;

public class FireCodeProblem {

    public static void main(String[] args){

    }

    public static String compressString(String text) {

        if(text==null){
            return null;

        }

        if(text.equals(""))
        {
            return text;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<text.length();i++)
        {

            if(!map.containsKey(text.charAt(i))){

                map.put(text.charAt(i),1);
            }

            else{
                Integer count = map.get(text.charAt(i));
                count=count+1;

                map.put(text.charAt(i),count);
            }
        }


        String ans  = "";

        for(Character key:map.keySet())
        {

            if(map.get(key)>1){
                ans+=key.toString()+map.get(key).toString();
            }

            else{
                ans+=key.toString();
            }

        }

        return ans;
    }
}
