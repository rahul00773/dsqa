
package Integer;

/**
 * @author rahul.kumar
 * @version $Id: ConvertIntoToByte.java, v 0.1 2020-04-07 00:52 rahul.kumar Exp $$
 */
public class ConvertIntoToByte {

    public static void main(String[] args){

        int x = 7899999;

        String b = Integer.toBinaryString(x);

        String[] s = b.split("");

        int count0 =0;
        int count1=0;

        for(int i =0;i<s.length;i++){

            if(s[i].equals("0")){
                count0++;

            }
            else count1++;
        }

        if(count1>count0 && count1%2!=0){
            System.out.println(1);
        }

        else {
            System.out.println(0);
        }
    }
}