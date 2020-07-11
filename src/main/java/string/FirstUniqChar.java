
package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author rahul.kumar
 * @version $Id: FirstUniqChar.java, v 0.1 2020-02-26 00:27 rahul.kumar Exp $$
 */
public class FirstUniqChar {


    static final int NO_OF_CHARS = 256;
    static HashMap<Character, CountIndex> hm
            = new HashMap<Character, CountIndex>(NO_OF_CHARS);


    public static void main(String[] args){
        System.out.println(getFirstUniq("b"));

    }

    public static Character  getFirstUniq(String str){ ;
        getCharCountArray(str);
        int result = Integer.MAX_VALUE, i;

        for (i = 0; i < str.length(); i++) {
            // If this character occurs only once and appears
            // before the current result, then update the result
            if (hm.get(str.charAt(i)).count == 1
                    && result > hm.get(str.charAt(i)).index) {
                result = hm.get(str.charAt(i)).index;
            }
        }

          if(result == Integer.MAX_VALUE)
              return null;

          return str.charAt(result);


    }

    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            // If character already occurred,
            if (hm.containsKey(str.charAt(i))) {
                // updating count
                hm.get(str.charAt(i)).incCount();
            }

            // If it's first occurrence, then store
            // the index and count = 1
            else {
                hm.put(str.charAt(i), new CountIndex(i));
            }
        }
    }



    static class CountIndex {
        int count, index;

        // constructor for first occurrence
        public CountIndex(int index)
        {
            this.count = 1;
            this.index = index;
        }

        // method for updating count
        public void incCount()
        {
            this.count++;
        }
    }
}