package string;

public class LowerToUpper {

    public static void main(String[] args) {

        String myName = "mY naME Is raHulA";
        System.out.println(print(myName));
    }

    public  static String  print(String s) {


        char[] c = s.toCharArray();


        for (int i = 0; i < c.length; i++) {


            if (c[i] >= 65 && c[i] <= 90) {

                c[i] = (char) (c[i] + 32);
            } else if (c[i] >= 97 && c[i] <= 122) {

                c[i] = (char) (c[i] - 32);

            }



        }



        for(int j =0; j<c.length; j++)
            System.out.print("");

        String sa="";

        return s.valueOf(c);
    }
}