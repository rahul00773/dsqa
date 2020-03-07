
package javadatastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.kumar
 * @version $Id: Test.java, v 0.1 2020-03-05 05:39 rahul.kumar Exp $$
 */
public class Test {

    public static void main(String[] args){

        int[] arr = {6,9,8};

        List<Integer> list = new ArrayList<>();


        list.add(arr[0]);
        list.add(arr[1]);

        list.set(1,arr[1]);

        list.remove(0);
        System.out.println(list);
    }
}