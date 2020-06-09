/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

/**
 * @author rahul.kumar
 * @version $Id: Test.java, v 0.1 2020-06-09 00:38 rahul.kumar Exp $$
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap.*;
import java.util.Iterator;
import java.util.Map;



    class Result {

        /*
         * Complete the 'mostActive' function below.
         *
         * The function is expected to return a STRING_ARRAY.
         * The function accepts STRING_ARRAY customers as parameter.
         */

        public static List<String> mostActive(List<String> customers) {
            // Write your code here
            HashMap<String,Double> hashMap = new HashMap<>();

            for(String s:customers ){
                if(hashMap.containsKey(s)){

                    Double x = hashMap.get(s);
                    hashMap.put(s, x+1);
                }
                else{
                    hashMap.put(s, 1.0);
                }

            }

            List<String>  output = new ArrayList<>();
            /** for(HashMap.Entry<String, Integer> map1 : hashMap.entrySet())
             {
             Integer totalCount = map1.getValue();

             if((totalCount/customers.size()*100)>5){
             output.add(map1.getKey());

             }
             } **/

            Iterator<Map.Entry<String, Double>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry<String, Double>)it.next();
                Double totalCount = (Double) e.getValue();

                if((totalCount/customers.size()*100.0)>=5.0){
                    if(!output.contains(e.getKey().toString())){
                        output.add(e.getKey().toString());
                    }


                }
            }
            output.sort(String::compareTo);

            return output;


        }

        public static void main(String[] args){

            List<String> s = new ArrayList<>();
            s.add("Omega");
            s.add("Omega");
            s.add("Omega");
            s.add("Omega");
            s.add("Omega");
            s.add("Omega");
            s.add("Omega");
            s.add("Alpha");


            mostActive(s);


        }
    }


