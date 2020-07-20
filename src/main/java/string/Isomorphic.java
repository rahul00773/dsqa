package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args){

        System.out.println(isIsomorphic("add","egg"));

    }

    public static boolean isIsomorphic(String input1, String input2) {

        if(input2==null || input1 ==null){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        HashMap<Character, Integer> map1 = new HashMap<>();


        for (int i =0; i<input1.length(); i++){

            if(!map.containsKey(input1.charAt(i) ) ){

                map.put(input1.charAt(i),1 );
            }


            else{

                Integer x = map.get( input1.charAt(i) );
                map.put(input1.charAt(i),x+1 );
            }
        }

        for (int j =0; j<input2.length(); j++){

            if(!map1.containsKey(input2.charAt(j) ) ){

                map1.put(input2.charAt(j),1 );
            }


            else{

                Integer y = map1.get( input2.charAt(j) );
                map1.put(input2.charAt(j),y+1 );
            }
        }

        if(map.size() !=map1.size()){
            return false;
        }

     Iterator<Map.Entry<Character, Integer>> iterable= map.entrySet().iterator();
        Iterator<Map.Entry<Character,Integer>> iterator = map1.entrySet().iterator();

        while (iterable.hasNext() || iterator.hasNext()){

            Map.Entry<Character, Integer> e1 = iterable.next();
            Map.Entry<Character, Integer> e2 = iterator.next();

            if(e1.getValue()!=e2.getValue()){
                return false;
            }
        }


        return true;
    }
}
