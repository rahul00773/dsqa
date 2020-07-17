package string;

import java.util.HashMap;

public class Permutation {

public static void main(String[] args){

    System.out.println(permutation("ABCQ","BCA"));
}

    public static boolean permutation(String str1, String str2) {


        HashMap<Character,Integer> map = new HashMap<>();


        if(str2==null || str1 ==null){
            return false;
        }




        for(int i =0; i<str1.length(); i++) {

            if (!map.containsKey(str1.charAt(i))) {

                map.put(str1.charAt(i), 1);
            } else {

                Integer x = map.get(str1.charAt(i));

                map.put(str1.charAt(i), x + 1);
            }

        }
            for(int j=0; j<str2.length(); j++){

                if(!map.containsKey(str2.charAt(j))){
                    return false;
                }

                else if(map.containsKey(str2.charAt(j))){

                    if(map.get(str2.charAt(j))>1){

                        int count =0;


                        for(int k=0;k<str2.length();k++){

                            if(str2.charAt(k)==str2.charAt(j) ){
                                count++;
                            }
                        }

                        if(count!=map.get(str2.charAt(j))){
                            return false;
                        }
                    }
                }
            }



        return true;
    }


}
