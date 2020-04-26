/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rahul.kumar
 * @version $Id: CheckRecord.java, v 0.1 2020-04-25 15:45 rahul.kumar Exp $$
 */
public class CheckRecord {

    public boolean checkRecord(String s) {


        int countA=0;

        for (int i =0; i<s.length(); i++){

            if(s.charAt(i) == 'A'){
                countA++;
            }
        }

        if(countA>1){
            return false;
        }


        Set<Character> set = new HashSet<>();

        int ans =0;

        int n = s.length();



        int len = s.length();


        int count = 0;
        int cur_count=0;
        char res = s.charAt(0);

        for (int i = 0; i < n; i++)
        {
            // If current character matches with next
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1))
                cur_count++;

                // If doesn't match, update result
                // (if required) and reset count
            else
            {
                if (cur_count > count)
                {
                    count = cur_count;
                    res = s.charAt(i);
                }
                cur_count = 1;
            }
        }

        if(count<=2 && res=='L'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        CheckRecord checkRecord = new CheckRecord();

        System.out.println(checkRecord.checkRecord("LLL"));
    }
}