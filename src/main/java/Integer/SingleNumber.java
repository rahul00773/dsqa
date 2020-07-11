package Integer;

import java.util.HashMap;

public class SingleNumber {

    public static void main(String[] args){

    }

    public static int singleNumber(int[] A) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;

        for(int i=0; i<A.length; i++){

            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }

            else {

                Integer res = map.get(A[i]);
                map.put(A[i],res+1);
            }

        }


        for(Integer key:map.keySet())
        {
            if(map.get(key)==1){
            ans=key;
        }
        }

        return ans;

    }
}
