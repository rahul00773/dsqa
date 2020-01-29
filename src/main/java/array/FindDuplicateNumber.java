/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author rahul.kumar
 * @version $Id: FindDuplicateNumber.java, v 0.1 2020-01-29 23:17 rahul.kumar Exp $$
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(getDuplicateUsingHashTable(arr));

    }

    public static int getDuplicate(int[] arr) {


        HashSet<Integer> hashSet = new HashSet<>();

        int ans =0 ;
        for (int i = 1; i < arr.length; i++) {

           if(hashSet.add(arr[i]) ==false){
               ans = arr[i];
           }
        }

        return ans;

    }

    public static int getDuplicateUsingHashTable(int[] arr){

        int ans =0;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0; i<arr.length; i++){

            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i],++count);


            }
            else{ hashMap.put(arr[i],1);}
        }


        Iterator hmIterator = hashMap.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int count = ((int)mapElement.getValue());
            if(count>1)
                ans=(int)mapElement.getKey();

        }

        return ans;
    }
}