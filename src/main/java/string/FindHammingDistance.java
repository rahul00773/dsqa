
package string;

/**
 * @author rahul.kumar
 * @version $Id: FindHammingDistance.java, v 0.1 2020-02-05 00:07 rahul.kumar Exp $$
 */
public class FindHammingDistance {

    public static void main(String[] args){

        String[] strings = {"10100","11111"};
        System.out.println(getHammingDistanceBetweenTwoString(strings));
    }

    public static int getHammingDistanceBetweenTwoString(String[] strings){

        int count = 0;

        int i =0;

        String first = strings[0];
        String secondString  = strings[1];

        int j = first.length()-1;

        while (i<j){

            if(first.charAt(i)!=secondString.charAt(i)){
                count++;

            }
            i++;
        }

        return count;
    }
}