
package map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author rahul.kumar
 * @version $Id: PutDataIntoMap.java, v 0.1 2020-05-20 16:34 rahul.kumar Exp $$
 */
public class PutDataIntoMap {

    public static void main(String[] args){

        int x =0,y=1;
        int a=0,b=1,c=3,d=4,e=0,f=1,g=1,h=0,i=0,k=1;


       // ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        if(map.containsKey(0)){

            ArrayList<String> list = new ArrayList<>();
            list.add("arpit");
            map.put(0,list);
        }

    }
}